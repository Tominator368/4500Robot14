/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author DE
 */
public class Fire extends CommandGroup {
    
    public Fire() {
        
        addSequential(new CompressFireCylinder());
        addSequential(new ExpandFireCylinder());
        addSequential(new Load());
    
    }
}
