package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
    	requires(Robot.drive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.drive(Robot.oi.stick.getY());
    	if(Robot.oi.stick.getX()<0) {
    		Robot.drive.turnLeft(Robot.oi.stick.getX());
    	}
    	if(Robot.oi.stick.getX()>0) {
    		Robot.drive.turnRight(Robot.oi.stick.getX());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
