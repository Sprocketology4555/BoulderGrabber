package org.usfirst.frc4555.BoulderGrabber.commands;

import org.usfirst.frc4555.BoulderGrabber.Robot;
import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmMove extends Command {
	
	
	boolean value;

    public ArmMove() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.arms);
        // eg. requires(chassis);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
		if (Robot.oi.joystick1.getPOV() == 0) {
    		
    		RobotMap.armsSpeedController1.set(.5);
    		RobotMap.armsSpeedController2.set(.5);
    		
    	} else if (Robot.oi.joystick1.getPOV() == 180) {
    		
    		RobotMap.armsSpeedController1.set(-.5);
    		RobotMap.armsSpeedController2.set(-.5);
    		
    	}
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (Robot.oi.joystick1.getPOV() == -1) {
    		
    		RobotMap.armsSpeedController1.set(0);
    		RobotMap.armsSpeedController2.set(0);
    		
    		value = true;
    		
    	}
    	
    }    	
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return value;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	//RobotMap.armsSpeedController1.set(0);
		//RobotMap.armsSpeedController2.set(0);
    	
    	value = false;
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
