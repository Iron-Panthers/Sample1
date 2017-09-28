package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystickCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	Spark leftmotor;
	Spark rightmotor;
	public Drive(Spark motor1,Spark motor2) {
		leftmotor = motor1;
		rightmotor = motor2;
	}
	public void forwards(double power) {
		leftmotor.set(power);
		rightmotor.set(power);
	}
	public void backwards(double power) {
		leftmotor.set(-power);
		rightmotor.set(-power);
	}
	public void stop() {
		leftmotor.set(0);
		rightmotor.set(0);
	}
	public void turnLeft(double power) {
		leftmotor.set(-power);
		rightmotor.set(power);
	}
	public void turnRight(double power) {
		leftmotor.set(power);
		rightmotor.set(-power);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystickCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

