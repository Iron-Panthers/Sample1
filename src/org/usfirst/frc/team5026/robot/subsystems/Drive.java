package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public Spark motor1;
	public Spark motor2;
	public Drive(Spark motor1, Spark motor2) {
		this.motor1 = motor1;
		this.motor2 = motor2;
	}
	public void driveForward() {
		motor1.set(1.0);
		motor2.set(1.0);
	}
	public void driveBackward() {
		motor1.set(-1.0);
		motor2.set(-1.0);
	}
	public void stop() {
		motor1.set(0.0);
		motor2.set(0.0);
	}
	public void disable() {
		motor1.disable();
		motor2.disable();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

