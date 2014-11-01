/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author DE
 */
public class UpperClaw extends Subsystem {
    Solenoid clawCylinderExpand = new Solenoid(RobotMap.clawSolenoidPort);
    Solenoid clawCylinderContract = new Solenoid(RobotMap.clawSolenoidPort2);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void openClaw() {
        clawCylinderExpand.set(false); //Claw is open when cylinder is CLOSED
        clawCylinderContract.set(true);
    }
    
    public void closeClaw() {
        clawCylinderContract.set(false);
        clawCylinderExpand.set(true); //Claw is closed when cylinder is OPEN
    }
}
