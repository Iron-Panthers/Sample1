package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public Talon motorForShootin;
	public Spark motorForIntaking;
	public Spark leftMotor1;
	public Spark leftMotor2;
	public Spark leftMotor3;
	public Spark rightMotor1;
	public Spark rightMotor2;
	public Spark rightMotor3;
	public Hardware() {
		motorForIntaking = new Spark(3);
		leftMotor1 = new Spark(2);
		leftMotor2 = new Spark(1);
		leftMotor3 = new Spark(4);
		rightMotor1 = new Spark(5);
		rightMotor2 = new Spark(6);
		rightMotor3 = new Spark(7);
		motorForShootin = new Talon(8);
		

	}
	
}
