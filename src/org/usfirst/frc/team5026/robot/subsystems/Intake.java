package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	Spark intakeMotor;
	public Intake (Spark motor) {
		intakeMotor = motor;
	}
	public void intake (double power) {
		intakeMotor.set(power);
	}
	public void outtake (double power) {
		intakeMotor.set(-power);
	}
	public void stop () {
		intakeMotor.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new IntakeCommand());
	}

}
