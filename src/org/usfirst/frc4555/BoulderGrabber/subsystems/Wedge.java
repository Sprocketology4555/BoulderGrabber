package org.usfirst.frc4555.BoulderGrabber.subsystems;

import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wedge extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final DoubleSolenoid doubleSolenoid3 = RobotMap.wedgeDoubleSolenoid3;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

