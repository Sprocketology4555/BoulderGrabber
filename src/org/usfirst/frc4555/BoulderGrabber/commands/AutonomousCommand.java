package org.usfirst.frc4555.BoulderGrabber.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {
    	
    	addSequential(new DriveForward());

    	
    }
    
}
