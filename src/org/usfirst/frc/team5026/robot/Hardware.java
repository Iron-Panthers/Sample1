package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public Talon motorForShootin;
	public Spark motorForIntaking;
	public Spark leftMotor;
	public Spark rightMotor;
	public Hardware() {
		motorForIntaking = new Spark(3);
		leftMotor = new Spark(2);
		rightMotor= new Spark(1);
		motorForShootin = new Talon(8);
		

	}
	
}
