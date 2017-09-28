package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;
import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	Spark leftMotor;
	Spark rightMotor;
	public Drive(Spark leftMotor, Spark rightMotor) {
		this.rightMotor = rightMotor;
		this.leftMotor = leftMotor;
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void goForwards(double power) {
		leftMotor.set(power);
		rightMotor.set(power);
	}
	public void goBackwards(double power) {
		leftMotor.set(0-(Math.abs(power)));
		rightMotor.set(0-(Math.abs(power)));
	}
	public void stopDriving() {
		leftMotor.set(0);
		rightMotor.set(0);
	}
	public void turnLeft() {
		leftMotor.set(0);	
		rightMotor.set(1);
	}
	public void turnRight() {
		leftMotor.set(1);	
		rightMotor.set(0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
}

