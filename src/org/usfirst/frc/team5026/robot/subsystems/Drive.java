package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public static Spark motor1;
	public static Spark motor2;
	public Drive(Spark m1,Spark m2)
	{
		motor1=m1;
		motor2=m2;
	}
	public void goForwards(double power) {
		motor1.set(.7);
		motor2.set(.7);
	}
	public void goBackwards(double power) {
		motor1.set(power);
		motor2.set(power);
	}
	public void stop() {
		motor1.set(0);
		motor2.set(0);
		
	}
	public void turnRight(double power) {
		motor1.set(0);
		motor2.set(power);
	}
	public void turnLeft(double power) {
		motor1.set(power);
		motor2.set(0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

