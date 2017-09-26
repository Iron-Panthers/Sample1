package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.DriveBackwardsForTime;
import org.usfirst.frc.team5026.robot.commands.DriveForwardsForTime;
import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;
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
	
	public Joystick stick;
	Button button1 = new JoystickButton(stick, 1);
	Button button2 = new JoystickButton(stick, 2);
	Button button3 = new JoystickButton(stick, 3);
	Button button4 = new JoystickButton(stick, 4);
	Button button5 = new JoystickButton(stick, 5);
	
	public OI() {
		stick = new Joystick(1);
	}
	
	public void mapButtons() {
		button1.whileHeld(new IntakeCommand());
		button2.whileHeld(new OuttakeCommand());
		button3.whileHeld(new DriveWithJoystick());
		button4.whenPressed(new DriveForwardsForTime(10, 0.7));
		button5.whenPressed(new DriveBackwardsForTime(10, 0.7));
	}
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
