package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public Spark motor1;
	public RobotDrive roboDrive;
	public Spark motor2;
	
	public Drive(Spark motor1, Spark motor2) {
		this.motor1 = motor1;
		this.motor2 = motor2;
		roboDrive = new RobotDrive(motor1, motor2);
	}
	public void driveForward() {
		roboDrive.setLeftRightMotorOutputs(1, 1);
	}
	public void driveBackward() {
		roboDrive.setLeftRightMotorOutputs(-1, -1);
	}
	public void stop() {
		motor1.set(0.0);
		motor2.set(0.0);
	}
	public void disable() {
		motor1.disable();
		motor2.disable();
	}
	public void arcadeDrive(double xAxis, double yAxis) {
		roboDrive.arcadeDrive(yAxis, xAxis);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    		setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

