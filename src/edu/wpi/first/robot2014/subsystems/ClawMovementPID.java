/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.robot2014.commands.ClawDoNothing;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
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
    
    public static final int LOWPOSITION=390, HIGHPOSITION=321; //Last year's #s
    
    SpeedController clawMover = new Victor(RobotMap.clawMovementMotorPort);
    AnalogPotentiometer clawPotentiometer = new AnalogPotentiometer(
            RobotMap.clawPotentiometerPort);

    // Initialize your subsystem here
    public ClawMovementPID() {
        super("ClawMovementPID", Kp, Ki, Kd);
        setSetpoint(LOWPOSITION);
        enable();
    }
    
    public void initDefaultCommand() {
        //setDefaultCommand(new ClawDoNothing());
        //^^ may not be a necessary command
    }
    
    protected double returnPIDInput() {
        return clawPotentiometer.get();
    }
    
    protected void usePIDOutput(double output) {
        clawMover.set(output);
    }
    
    /*public void moveUp() {
        clawMover.set(RobotMap.clawMoverSpeed);
    }
    
    public void moveDown() {
        clawMover.set(-1 * RobotMap.clawMoverSpeed);
    }*/
}
