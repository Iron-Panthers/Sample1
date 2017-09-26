package org.usfirst.frc.team5026.robot.subsystems;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	public intakeouttakeandstop Geartwister;
	public Spark motor1;
	public Intake () {
		motor1 = new Spark(3);
		Geartwister = new intakeouttakeandstop(motor1);
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
		
	}
	
}
