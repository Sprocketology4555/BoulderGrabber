package org.usfirst.frc4555.BoulderGrabber.commands;

import org.usfirst.frc4555.BoulderGrabber.Robot;
import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoArmDown extends Command {
	
	Timer timer1 = new Timer();
	
	boolean value1 = false;

    public AutoArmDown() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.arms);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	RobotMap.armsSpeedController1.set(-.5);
    	RobotMap.armsSpeedController2.set(.5);
    	
    	timer1.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (timer1.get() >= 1) {
    		
    		value1 = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return value1;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	RobotMap.armsSpeedController1.set(0);
    	RobotMap.armsSpeedController2.set(0);
    	
    	timer1.stop();
    	timer1.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
