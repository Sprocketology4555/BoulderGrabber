package org.usfirst.frc4555.BoulderGrabber.commands;

import org.usfirst.frc4555.BoulderGrabber.Robot;
import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveBackward extends Command {
	
	Timer timer1 = new Timer();
	
	boolean value1 = false;

    public DriveBackward() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.driveTrain);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	RobotMap.drivetrainSpeedController1.set(-1);
    	RobotMap.drivetrainSpeedController2.set(-1);
    	RobotMap.drivetrainSpeedController3.set(1);
    	RobotMap.drivetrainSpeedController4.set(1);
    	
    	timer1.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (timer1.get() >= 5) {
    		
    		value1 = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return value1;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	RobotMap.drivetrainSpeedController1.set(0);
    	RobotMap.drivetrainSpeedController2.set(0);
    	RobotMap.drivetrainSpeedController3.set(0);
    	RobotMap.drivetrainSpeedController4.set(0);

    	
    	timer1.stop();
    	timer1.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
