package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DriveForwardsForTime extends TimedCommand {
	
	Timer timer = new Timer();
	double secs;
	double speed;
	
    public DriveForwardsForTime(double secs, double speed) {
        super(secs);
        this.secs = Math.abs(secs);
        this.speed = Math.abs(speed);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.drive);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while (!(timer.hasPeriodPassed(secs))) {
    		Robot.drive.setLeftRightMotors(speed, speed);;
    	}
    }

    // Called once after timeout
    protected void end() {
    	Robot.drive.stop();
    	timer.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
