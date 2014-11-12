
package edu.wpi.first.robot2014;

import edu.wpi.first.robot2014.commands.AimClaw;
import edu.wpi.first.robot2014.commands.Fire;
import edu.wpi.first.robot2014.commands.RollersDoNothing;
import edu.wpi.first.robot2014.commands.RollersRoll;
import edu.wpi.first.robot2014.subsystems.ClawMovementPID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    Joystick driveStick = new Joystick(1);
    
    Button b1 = new JoystickButton(driveStick, 1),
            b2 = new JoystickButton(driveStick, 2),
            b3 = new JoystickButton(driveStick, 3),
            b4 = new JoystickButton(driveStick, 4);
    
    Trigger mainTrigger = new JoystickButton(driveStick, 1);
    
    public OI() {
        mainTrigger.whenActive(new Fire());
        
        b1.whenPressed(new AimClaw(ClawMovementPID.HIGHPOSITION));
        b2.whenPressed(new AimClaw(ClawMovementPID.LOWPOSITION));
        b3.whenPressed(new RollersRoll());
        b4.whenPressed(new RollersDoNothing());
    }
    
    
    public double getLeftSpeed() {
        return driveStick.getY();
    }
    
    public double getRightSpeed() {
        return driveStick.getY();
    }
    
    public double getTwist() {
        return driveStick.getZ();
    }
    




//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
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
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

