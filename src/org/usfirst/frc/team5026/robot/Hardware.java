package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	
	public Spark intakeMotor;
	public Spark leftMotor = new Spark(0);
	public Spark rightMotor = new Spark(1);
	public Joystick stick;	
}
