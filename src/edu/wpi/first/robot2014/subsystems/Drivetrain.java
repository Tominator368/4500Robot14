/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.robot2014.subsystems;

import edu.wpi.first.robot2014.RobotMap;
import edu.wpi.first.robot2014.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author DE
 */
public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    //All of this should be taken care of in the RobotDrive object:
    /*Talon flMotor = new Talon(RobotMap.flMotorPort);
    Talon frMotor = new Talon(RobotMap.frMotorPort);
    Talon blMotor = new Talon(RobotMap.blMotorPort);
    Talon brMotor = new Talon(RobotMap.brMotorPort);
    */
    
    private RobotDrive drive = new RobotDrive(
            RobotMap.flMotorPort,
            RobotMap.frMotorPort,
            RobotMap.blMotorPort,
            RobotMap.brMotorPort);
            

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void mecanumDrive(double left, double right, double twist) {
        drive.mecanumDrive_Cartesian(left, right, twist, 0);
    }
}
