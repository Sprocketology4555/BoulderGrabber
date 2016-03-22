package org.usfirst.frc4555.BoulderGrabber.subsystems;



import org.usfirst.frc4555.BoulderGrabber.RobotMap;
import org.usfirst.frc4555.BoulderGrabber.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	SpeedController speedController1 = RobotMap.drivetrainSpeedController1;
    SpeedController speedController2 = RobotMap.drivetrainSpeedController2;
    SpeedController speedController3 = RobotMap.drivetrainSpeedController3;
    SpeedController speedController4 = RobotMap.drivetrainSpeedController4;
    RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;
    
    // Put methods for controlling this subsystem
	
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new ArcadeDrive());
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(Joystick joystick1){
    	robotDrive41.arcadeDrive(joystick1);
    }
}

