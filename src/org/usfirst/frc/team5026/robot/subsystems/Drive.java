package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	Spark leftMotor;
	Spark rightMotor;
	RobotDrive drive = new RobotDrive(leftMotor, rightMotor);
	public Drive(Spark leftMotor, Spark rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void joystickDrive(Joystick stick) {
		drive.arcadeDrive(stick);
	}
	
	public void userArcadeDrive(double yAxis, double xAxis) {
		drive.arcadeDrive(yAxis, xAxis);
	}
	
	public void setLeftRightMotors(double leftSpeed, double rightSpeed) {
		drive.setLeftRightMotorOutputs(leftSpeed, rightSpeed);
	}
	
	public void stop() {
		setLeftRightMotors(0, 0);
	} 
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
}

