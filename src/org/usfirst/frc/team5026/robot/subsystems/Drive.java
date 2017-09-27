package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.DriveMotorGroup;
import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DriveMotorGroup left;
	DriveMotorGroup right;
	public void drive(double power) {
		left.set(power);
		right.set(power);
	}
	public void stop() {
		left.stop();
		right.stop();
	}
	public Drive() {
		left = new DriveMotorGroup(Robot.hardware.leftMotor1,Robot.hardware.leftMotor2,Robot.hardware.leftMotor3);
		right = new DriveMotorGroup(Robot.hardware.rightMotor1,Robot.hardware.rightMotor2,Robot.hardware.rightMotor3);

	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

