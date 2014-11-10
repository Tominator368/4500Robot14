package edu.wpi.first.robot2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //All port #s on the sidecar defined here with descriptive variable names
    //NOTE: These are all currently WRONG! Placeholder values have been added
    //for organizational purposes, and will need to be updated later.
    //we may also need to add a module # for every one of these if we need
    //multiple sidecars or if the cRIO ports work differently than I think
    public static final int
            flMotorPort = 1,
            frMotorPort = 2,
            blMotorPort = 3,
            brMotorPort = 4,
            wenchMotorPort = 5,
            rollerMotorPort = 6,
            compressorPort1 = 7,
            compressorPort2 = 8,
            fireSolenoidPort = 9,
            fireSolenoidPort2 = 10,
            clawSolenoidPort = 11,
            clawSolenoidPort2 = 12,
            clawMovementMotorPort = 13,
            punchLimitSwitchPort = 14,
            clawPotentiometerPort = 15;
    
    //default motor speeds
    //NOTE: These are also all WRONG. 
    //I set them all to 0.1 for now just to be safe
    public static final double
            wenchMotorSpeed = 0.1,
            clawMoverSpeed = 0.1;
    public static final double clawTolerance = .5; //Potentiometer tolerance - WRONG
    
  
}
