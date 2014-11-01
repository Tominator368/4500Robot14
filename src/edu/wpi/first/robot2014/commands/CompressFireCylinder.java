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
public class CompressFireCylinder extends CommandBase {
    
    public CompressFireCylinder() {

    requires(linearPunch);
     
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        linearPunch.compressFireCylinder();
    }

    // Make this return true when this Command no longer needs to run execute()
    
    //Automatically returns true after one cycle (it only needs to compress once)
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
