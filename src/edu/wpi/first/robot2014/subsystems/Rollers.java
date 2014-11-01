/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.robot2014.commands.RollersDoNothing;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author DE
 */
public class Rollers extends Subsystem {
  

    
    
    Relay rollerController = new Relay(RobotMap.rollerMotorPort);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RollersDoNothing());
    }
    
    public void roll() {
        rollerController.set(Relay.Value.kForward);
    }
    
    public void rollersDoNothing() {
        rollerController.set(Relay.Value.kOff);
    }
}
