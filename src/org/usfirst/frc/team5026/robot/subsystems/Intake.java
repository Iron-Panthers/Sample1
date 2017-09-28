package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.commands.GroundIntakeIntake;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	public static Spark motor;
	public Intake(Spark m){
		motor=m;
	}
	public void intake(){
		motor.set(.7);
	}
	public void outtake(){
		motor.set(-.5);
	}
	public void stop(){
		motor.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new GroundIntakeIntake());
    }
}

