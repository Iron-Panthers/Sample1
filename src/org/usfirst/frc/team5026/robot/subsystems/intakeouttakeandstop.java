package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;

public class intakeouttakeandstop {
	SpeedController intakeMotor;
	public intakeouttakeandstop(SpeedController motor) {
		intakeMotor=motor;
	}
	public void intake(double power) {
		intakeMotor.set(power);
	}
	public void outtake (double power) {
		intakeMotor.set(-power);
	}
	public void stop () {
		intakeMotor.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}