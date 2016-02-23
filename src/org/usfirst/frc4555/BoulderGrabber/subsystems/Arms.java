package org.usfirst.frc4555.BoulderGrabber.subsystems;

import org.usfirst.frc4555.BoulderGrabber.RobotMap;
import org.usfirst.frc4555.BoulderGrabber.commands.ArmMove;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arms extends Subsystem {
	SpeedController armsSpeedController1 = RobotMap.armsSpeedController1;
	SpeedController armsSpeedController2 = RobotMap.armsSpeedController2;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new ArmMove());
        //setDefaultCommand(new MySpecialCommand());
    }
}

