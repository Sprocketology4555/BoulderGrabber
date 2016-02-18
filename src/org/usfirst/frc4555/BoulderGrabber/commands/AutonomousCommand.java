package org.usfirst.frc4555.BoulderGrabber.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {

    	if (SmartDashboard.getBoolean("DB/Button 1", true) && (SmartDashboard.getBoolean("DB/Button 2", false) && (SmartDashboard.getBoolean("DB/Button 3", false)))) { 
    		
    		
    		
    	} else if (SmartDashboard.getBoolean("DB/Button 1", false) && (SmartDashboard.getBoolean("DB/Button 2", true) && (SmartDashboard.getBoolean("DB/Button 3", false)))) {
    		
    		
	
    	} else if (SmartDashboard.getBoolean("DB/Button 1", false) && (SmartDashboard.getBoolean("DB/Button 2", false) && (SmartDashboard.getBoolean("DB/Button 3", true)))) {
    		
    		
	
    	} else {
    		
    		
    		
    	}
    	
    }
    
}
