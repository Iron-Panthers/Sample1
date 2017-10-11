package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	
	public Spark intakeMotor;
	public Spark leftMotor;
	public Spark rightMotor;
	public Spark motorForShooting;
	
	public Hardware() {
		leftMotor = new Spark(0);
		rightMotor = new Spark(1);
		intakeMotor = new Spark(3);
		motorForShooting = new Spark(2);
	}
}
