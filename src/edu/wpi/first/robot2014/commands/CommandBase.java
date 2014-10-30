package edu.wpi.first.robot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.robot2014.OI;
import edu.wpi.first.robot2014.subsystems.ClawMovementPID;
import edu.wpi.first.robot2014.subsystems.Drivetrain;
import edu.wpi.first.robot2014.subsystems.ExampleSubsystem;
import edu.wpi.first.robot2014.subsystems.LinearPunchPID;
import edu.wpi.first.robot2014.subsystems.PneumaticChargePID;
import edu.wpi.first.robot2014.subsystems.Rollers;
import edu.wpi.first.robot2014.subsystems.UpperClaw;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    public static ClawMovementPID clawMovement = new ClawMovementPID();
    public static Drivetrain drivetrain = new Drivetrain();
    public static LinearPunchPID linearPunch = new LinearPunchPID();
    public static PneumaticChargePID pneumaticCharge = new PneumaticChargePID();
    public static Rollers rollers = new Rollers();
    public static UpperClaw upperClaw = new UpperClaw();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
