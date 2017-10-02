package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystickCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public RobotDrive robotDrive;
	public Drive(Spark motor1,Spark motor2) {
		robotDrive = new RobotDrive(motor1,motor2);
	}
	public void forwards(double power) {
		robotDrive.setLeftRightMotorOutputs(power, power);
	}
	public void backwards(double power) {
		robotDrive.setLeftRightMotorOutputs(-power, -power);
	}
	public void stop() {
		robotDrive.stopMotor();
	}
	public void turnLeft(double power) {
		robotDrive.setLeftRightMotorOutputs(-power, power);
	}
	public void turnRight(double power) {
		robotDrive.setLeftRightMotorOutputs(power, -power);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystickCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

