package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{
	Spark motorForIntaking;
	public Intake(Spark motor) {
		motorForIntaking = motor;
	}
	public void intake(double power) { //0.7 for intaking
		motorForIntaking.set(0);
		motorForIntaking.set(power);
	}
	public void outtake(double power) { //0.5 for outtaking
		motorForIntaking.set(0);
		motorForIntaking.set(-Math.abs(power));
	}
	public void stop() {
		motorForIntaking.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new IntakeCommand()); //When Intake is constructed, it will run the IntakeCommand
	}
}
