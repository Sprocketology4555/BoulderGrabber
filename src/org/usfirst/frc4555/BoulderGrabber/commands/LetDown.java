package org.usfirst.frc4555.BoulderGrabber.commands;

import org.usfirst.frc4555.BoulderGrabber.Robot;
import org.usfirst.frc4555.BoulderGrabber.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LetDown extends Command {

    public LetDown() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.wedge);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.wedgeDoubleSolenoid3.set(DoubleSolenoid.Value.kReverse);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
