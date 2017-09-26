package org.usfirst.frc.team5026.robot.subsystems;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	public static Talon motor;
	public Intake(Talon m){
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
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

