package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DriveBackwardsForTime extends TimedCommand {
	public double drivePower;
    public DriveBackwardsForTime(double timeout, double power) {
        super(timeout);
        requires(Robot.drive);
        drivePower = power;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.goBackwards(drivePower);
    }

    // Called once after timeout
    protected void end() {
    	Robot.drive.stop(); //Stops when time is done, not when button is let go of
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
