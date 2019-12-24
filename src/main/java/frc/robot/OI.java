/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  public static final double DEADZONE_LIMIT = 0.1;
  public XboxController Controller0 = new XboxController(0);

  public double LeftX (XboxController Controller){double raw = Controller.getRawAxis(0);return Math.abs(raw)< DEADZONE_LIMIT ? 0.0 : raw;}
  public double LeftY (XboxController Controller){double raw = Controller.getRawAxis(1);return Math.abs(raw)< DEADZONE_LIMIT ? 0.0 : raw;}
  public boolean AButtonDown(XboxController Controller){return Controller.getAButton();}
  public boolean BButtonDown(XboxController Controller){return Controller.getBButton();}


  public boolean getUp(){
    return Controller0.getBButton();
  }
  public boolean getDown(){
    return Controller0.getAButton();
  }
  
  


  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
}
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

