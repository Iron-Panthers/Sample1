package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.ShooterCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	Spark motorForShooting;
	
	public Shooter(Spark motorForShooting) {
		this.motorForShooting = motorForShooting;
	}
	
	public void shoot(double power) {
		motorForShooting.set(power);
	}
	
	public void stop() {
		motorForShooting.set(0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ShooterCommand(Robot.dadamPower));
    }
}

