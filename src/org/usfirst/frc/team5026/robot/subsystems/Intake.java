package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	public intakeouttakeandstop Geartwister;
	public Spark motorForIntaking;
	public Intake (Spark motorForIntaking) {
		Geartwister = new intakeouttakeandstop(motorForIntaking);
		this.motorForIntaking = motorForIntaking;
	} 
	public void intake() {
		Geartwister.intake(1.0);
	}
	public void outtake() {
		Geartwister.outtake(1.0);
	}
	public void stop() {
		Geartwister.stop();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new IntakeCommand());
	}
	
}
