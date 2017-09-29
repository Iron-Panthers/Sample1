package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoyStick extends Command {

    public DriveWithJoyStick() {
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double powerY=Robot.oi.stick.getY();
    	if(powerY>0) {
    		Robot.driveSubsystem.goForwards(powerY);
    	}
    	else if(powerY<0) {
    		Robot.driveSubsystem.goBackwards(powerY);
    	}
    	else if(powerY==0) {
    		Robot.driveSubsystem.stop();
    	}
    	Robot.oi.stick.getX();
    	
    	double powerX=Robot.oi.stick.getX();
    	if(powerX>0) {
    		Robot.driveSubsystem.turnRight(powerX);
    	}
    	else if(powerX<0) {
    		Robot.driveSubsystem.turnLeft(powerX);
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
