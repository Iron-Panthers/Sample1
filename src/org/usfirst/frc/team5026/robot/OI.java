package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.GroundIntakeIntake;
import org.usfirst.frc.team5026.robot.commands.GroundIntakeOuttake;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick stick;
	Button StickBtn_One;
	Button StickBtn_Two;
	public OI()
	{
		stick=new Joystick(1);
		StickBtn_One=new JoystickButton(stick,1);
		StickBtn_Two=new JoystickButton(stick,2);
		
	}
	public void mapButtons()
	{
		StickBtn_One.whileHeld(new GroundIntakeIntake());
		StickBtn_Two.whileHeld(new GroundIntakeOuttake());
	}
}
