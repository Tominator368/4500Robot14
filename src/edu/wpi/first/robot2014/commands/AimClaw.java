/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.commands;

import edu.wpi.first.robot2014.RobotMap;



/**
 *
 * @author DE
 */
public class AimClaw extends CommandBase {
    private double setpoint;
    
    /**
     * Sets the claw to move to a certain potentiometer position.
     * NOTE - Low and high positions defined in:
     * ClawMovementPID.LOWPOSITION and ClawMovementPID.HIGHPOSITION
     * @param setpoint 
     */
    public AimClaw(double setpoint) {
        requires(clawMovement);
        this.setpoint = setpoint;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    clawMovement.setSetpoint(setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(clawMovement.getPosition() - setpoint) < RobotMap.clawTolerance;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
