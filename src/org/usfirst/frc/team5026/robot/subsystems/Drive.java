package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public RobotDrive robotDrive;
	public Drive(Spark leftMotor, Spark rightMotor) {
		robotDrive = new RobotDrive(leftMotor,rightMotor);
	}
	public void drive(double power) { //Can be negative or positive
		robotDrive.drive(power, power);
	}
	public void goForwards(double power) {
		robotDrive.drive(Math.abs(power), Math.abs(power));
	}
	public void goBackwards(double power) {
		robotDrive.drive(-Math.abs(power), -Math.abs(power));
	}
	public void stop() {
		robotDrive.stopMotor();
	}
	public void turnRight(double power) {
		robotDrive.setLeftRightMotorOutputs(Math.abs(power), -Math.abs(power));
	}
	public void turnLeft(double power) {
		robotDrive.setLeftRightMotorOutputs(-Math.abs(power), Math.abs(power));
	}
	public void useArcadeDrive(double yAxis, double xAxis) {
		robotDrive.arcadeDrive(yAxis, xAxis);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

