package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public Spark leftMotor;
	public Spark rightMotor;
	public Drive(Spark leftMotor, Spark rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	public void drive(double power) { //Can be negative or positive
		leftMotor.set(power);
		rightMotor.set(power);
	}
	public void goForwards(double power) {
		leftMotor.set(Math.abs(power));
		rightMotor.set(Math.abs(power));
	}
	public void goBackwards(double power) {
		leftMotor.set(-Math.abs(power));
		rightMotor.set(-Math.abs(power));
	}
	public void stop() {
		leftMotor.set(0);
		rightMotor.set(0);
	}
	public void turnRight(double power) {
		leftMotor.set(Math.abs(power));
		rightMotor.set(-Math.abs(power));
	}
	public void turnLeft(double power) {
		leftMotor.set(-Math.abs(power));
		rightMotor.set(Math.abs(power));
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

