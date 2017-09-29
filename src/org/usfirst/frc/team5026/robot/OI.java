package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.DriveBackwardsForTime;
import org.usfirst.frc.team5026.robot.commands.DriveForwardsForTime;
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
	public double time = 3;
	public Joystick stick;
	public Button StickBtnOne;
	public Button StickBtnTwo;
	public Button StickBtnFour;
	public Button StickBtnFive;
	public OI() {
		stick = new Joystick(1);
		StickBtnOne = new JoystickButton(stick,1);
		StickBtnTwo = new JoystickButton(stick,2);
		StickBtnFour = new JoystickButton(stick,4);
		StickBtnFive = new JoystickButton(stick,5);
	}
	public void mapButtons() {
		StickBtnOne.whileHeld(new IntakeCommand());
		StickBtnTwo.whileHeld(new OuttakeCommand());
		StickBtnFour.whileHeld(new DriveForwardsForTime(time,1)); //20 seconds, runs at full power
		StickBtnFive.whileHeld(new DriveBackwardsForTime(time,1));//""
	}
}
