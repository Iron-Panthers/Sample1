package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.SpeedController;

public class DriveMotorGroup {
	SpeedController leftMotor;
	SpeedController middleMotor;
	SpeedController rightMotor;
	public DriveMotorGroup(SpeedController m1,SpeedController m2,SpeedController m3) {
		leftMotor = m1;
		middleMotor = m2;
		rightMotor = m3;
	}
	public void set(double newSpeed) {
		leftMotor.set(newSpeed);
		middleMotor.set(newSpeed);
		rightMotor.set(newSpeed);
	}
	public void stop() {
		leftMotor.set(0);
		middleMotor.set(0);
		rightMotor.set(0);
	}
	public void disable() {
		leftMotor.disable();
		middleMotor.disable();
		rightMotor.disable();
	}
}
