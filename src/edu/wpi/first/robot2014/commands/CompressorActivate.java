/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.commands;

/**
 *
 * @author DE
 */
public class CompressorActivate extends CommandBase {
    
    public CompressorActivate() {
        requires(pneumaticCharge);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        pneumaticCharge.activate();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //May need to return true when a certain pressure is reached
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
