/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3397.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotLayout {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//Drive motors
	VictorSP frontLeftMotor = new VictorSP(0);
	VictorSP frontRightMotor = new VictorSP(1);
	VictorSP backLeftMotor = new VictorSP(2);
	VictorSP backRightMotor = new VictorSP(3);
	
	public VictorSP getFrontLeftMotor() {
		return frontLeftMotor;
	}
	public void setFrontLeftMotor(VictorSP frontLeftMotor) {
		this.frontLeftMotor = frontLeftMotor;
	}
	public VictorSP getFrontRightMotor() {
		return frontRightMotor;
	}
	public void setFrontRightMotor(VictorSP frontRightMotor) {
		this.frontRightMotor = frontRightMotor;
	}
	public VictorSP getBackLeftMotor() {
		return backLeftMotor;
	}
	public void setBackLeftMotor(VictorSP backLeftMotor) {
		this.backLeftMotor = backLeftMotor;
	}
	public VictorSP getBackRightMotor() {
		return backRightMotor;
	}
	public void setBackRightMotor(VictorSP backRightMotor) {
		this.backRightMotor = backRightMotor;
	}
	
}
