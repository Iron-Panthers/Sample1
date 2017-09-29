package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.subsystems.intakeouttakeandstop;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	public Spark motorForIntaking;
	public Spark motor1;
	public Spark motor2;
	public Hardware() {
		motor2 = new Spark(0);
		motor1 = new Spark(1);
		motorForIntaking = new Spark(3);
	}
	
}