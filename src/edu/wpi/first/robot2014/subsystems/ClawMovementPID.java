/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.robot2014.commands.ClawDoNothing;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 * @author DE
 */
public class ClawMovementPID extends PIDSubsystem {

    private static final double Kp = 0.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    
    Victor clawMover = new Victor(RobotMap.clawMovementMotorPort);
    AnalogChannel clawPotentiometer = new AnalogChannel(
            RobotMap.clawPotentiometerPort);

    // Initialize your subsystem here
    public ClawMovementPID() {
        super("ClawMovementPID", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ClawDoNothing());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
    public void moveUp() {
        clawMover.set(RobotMap.clawMoverSpeed);
    }
    
    public void moveDown() {
        clawMover.set(-1 * RobotMap.clawMoverSpeed);
    }
}
