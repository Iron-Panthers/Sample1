package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.IntakeCommand;
import org.usfirst.frc.team5026.robot.commands.OuttakeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick stick;
	Button StickBtnOne;
	Button StickBtnTwo;
	public OI() {
		stick = new Joystick(1);
		StickBtnOne = new JoystickButton(stick,1);
		StickBtnTwo = new JoystickButton(stick,2);
	}
	public void mapButtons() {
		StickBtnOne.whileHeld(new IntakeCommand());
		StickBtnTwo.whileHeld(new OuttakeCommand());
	}
}
