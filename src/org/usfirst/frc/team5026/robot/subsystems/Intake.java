package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.IntakeIntakeCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {//only one command requiring a subsystem can be active at a time
	Spark intakeMotor;
	public Intake(Spark motor) {
		intakeMotor = motor;
	}
	public void intake(double power) {
		intakeMotor.set(power);
	}
	public void outtake(double power) {
		intakeMotor.set(-power);
	}
	public void stop() {
		intakeMotor.set(0);
	}
	public void initDefaultCommand() {
		setDefaultCommand(new IntakeIntakeCommand());
	}
}
