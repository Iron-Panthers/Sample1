package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DriveForwardsForTime extends TimedCommand {
	public double drivePower;
	public double duration;
    public DriveForwardsForTime(double timeout, double power) {
        super(timeout);
        requires(Robot.drive);
        drivePower = power;
        duration = timeout;
        
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.goForwards(drivePower);
    	//if(Robot.oi.StickBtnFour.) {
    	if(Robot.oi.StickBtnFour.get()) { //Test if it continues if button 5, etc is pressed while 4 is not
    		duration+=0.01;
    		super.setTimeout(duration);
    		//System.out.println("Running DriveForwardsForTime (Button 4)"+duration);
    	}
    	
    	//}	
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
