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
            clawSolenoidPort = 10,
            clawMovementMotorPort = 11,
            punchLimitSwitchPort = 12;
    
  
}
