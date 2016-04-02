package org.usfirst.frc4555.BoulderGrabber.commands;

import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GrabStop extends Command {

    public GrabStop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	RobotMap.clawSpeedController.set(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
