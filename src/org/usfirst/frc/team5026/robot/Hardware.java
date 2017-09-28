package org.usfirst.frc.team5026.robot;

//Spark is the SpeedController
import edu.wpi.first.wpilibj.Spark;
public class Hardware { //Make sure that all subsystems are in file with Hardware Constants //Magic numbers are kept track in Hardware class; organization thing
	//public Talon motorForFiring;
	//public Spark leftMotor1;
	//public Spark leftMotor2;
	//public Spark leftMotor3;
	//public Spark rightMotor1;
	//public Spark rightMotor2;
	//public Spark rightMotor3;
	public Spark leftMotor;
	public Spark rightMotor;
	public Spark motorForIntaking;
	public Hardware() {
		//leftMotor1 = new Spark(2); //sets to PWM slot 2
		//leftMotor2 = new Spark(1);
		//leftMotor3 = new Spark(4);
		//rightMotor1 = new Spark(5);
		//rightMotor2 = new Spark(6);
		//rightMotor3 = new Spark(7);
		motorForIntaking = new Spark(3);
		//motorForFiring = new Talon(8); 
		leftMotor = new Spark(0);
		rightMotor = new Spark(1);
		
	}
}
