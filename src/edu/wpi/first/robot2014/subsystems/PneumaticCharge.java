/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author DE
 */
public class PneumaticCharge extends Subsystem {
    
     Compressor pump = new Compressor(
            RobotMap.compressorPort1,
            RobotMap.compressorPort2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void activate() {
        pump.start(); //I think the start method starts the pump...? I'd assume...
    }
    
    //May not be necessary because the pump should always turn itself off
    public void deactivate() {
        pump.stop();
    }
}
