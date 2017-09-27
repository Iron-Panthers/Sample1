package org.usfirst.frc.team5026.robot;


import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cannon extends Subsystem {
	Talon datBoi;
	public Cannon (Talon bestController) {
		datBoi = bestController;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void shoot() {
		datBoi.set(1);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

