/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.robot2014.commands.Load;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 * @author DE
 */
public class LinearPunchPID extends PIDSubsystem {

    private static final double Kp = 0.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    
    Solenoid fireCylinderExpand = new Solenoid(RobotMap.fireSolenoidPort);
    Solenoid fireCylinderContract = new Solenoid(RobotMap.fireSolenoidPort2);
    Victor wenchMotor = new Victor(RobotMap.wenchMotorPort);
    DigitalInput punchLimitSwitch = new DigitalInput(
            RobotMap.punchLimitSwitchPort);

    // Initialize your subsystem here
    public LinearPunchPID() {
        super("LinearPunchPID", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Load()); //Sets the claw to automatically load
                                       //when there's nothing better to do.
                                       //May need to do nothing, not sure yet
    }
    
    protected double returnPIDInput() {
        /*if (punchLimitSwitch.get()) {
            return 1.0;
        }*/
        
        //we may not need this method for a simple limit switch
        
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
    public void compressFireCylinder() {
        fireCylinderContract.set(false);
        fireCylinderExpand.set(true);
    }
    
    public void expandFireCylinder() {
        fireCylinderExpand.set(false);
        fireCylinderContract.set(true);
    }
    
    public void turnWenchMotor() {
        wenchMotor.set(RobotMap.wenchMotorSpeed);
    }
    
    public boolean limitSwitchState() {
        return punchLimitSwitch.get();
    }
}
