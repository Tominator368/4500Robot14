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
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Thomas
 */
public class LinearPunch extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Solenoid fireCylinderExpand = new Solenoid(RobotMap.fireSolenoidPort);
    Solenoid fireCylinderContract = new Solenoid(RobotMap.fireSolenoidPort2);
    Victor wenchMotor = new Victor(RobotMap.wenchMotorPort);
    DigitalInput punchLimitSwitch = new DigitalInput(
            RobotMap.punchLimitSwitchPort);

    public void initDefaultCommand() {
        setDefaultCommand(new Load());
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
