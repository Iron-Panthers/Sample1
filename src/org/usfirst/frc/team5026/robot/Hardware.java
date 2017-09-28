package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;

public class Hardware {
	public Spark motorForIntaking;
	public Spark leftmotor;
	public Spark rightmotor;
	/*public Spark leftMotor1;
	public Spark leftMotor2;
	public Spark leftMotor3;
	public Spark rightMotor1;
	public Spark rightMotor2;
	public Spark rightMotor3;
	TalonSRX motorForFiring;
	*/
	public Hardware() {
		motorForIntaking = new Spark(3);
		leftmotor = new Spark(0);
		rightmotor = new Spark(1);
		/*leftMotor1 = new Spark(1);
		leftMotor2 = new Spark(2);
		leftMotor3 = new Spark(4);
		rightMotor1 = new Spark(5);
		rightMotor2 = new Spark(6);
		rightMotor3 = new Spark(7);
		motorForFiring = new TalonSRX(8);
		*/
	}
}
