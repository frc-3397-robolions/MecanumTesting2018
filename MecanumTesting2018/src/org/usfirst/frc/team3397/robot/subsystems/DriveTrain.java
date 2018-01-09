package org.usfirst.frc.team3397.robot.subsystems;

import org.usfirst.frc.team3397.robot.RobotLayout;
import org.usfirst.frc.team3397.robot.OI;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain {
	
	MecanumDrive chassis;
	RobotLayout robotLayout;
	OI controlScheme = new OI(0, 1);
	
	public DriveTrain(VictorSP frontLeft, VictorSP frontRight, VictorSP backLeft, VictorSP backRight) {
		chassis = new MecanumDrive(frontLeft, frontRight, backLeft, backRight);
	}
	
	
	
	public void MecanumDrive() {
		double forward = controlScheme.getForward();
		double strafe = controlScheme.getStrafe();
		double turn = controlScheme.getTurn();
		
		double nonTurboSpeed = 0.7;
		double turboSpeed = 0.85;
		
		double speedMultiplier = 0.0;
		
		double deadzone = 0.1;
		
		if (Math.abs(forward) >= deadzone || Math.abs(strafe) >= deadzone) {
			if (controlScheme.getTurbo()) {
				speedMultiplier = turboSpeed;
			}
			else
			{
				speedMultiplier = nonTurboSpeed;
			}
			
			forward *= speedMultiplier;
			strafe *= speedMultiplier;
			turn *= speedMultiplier;
			
			chassis.driveCartesian(forward, strafe, turn);
		}
		
	}
	
}
