/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.fireteam322.frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import com.fireteam322.frc.robot.subsystems.Chassis;

public class ChassisBrake extends CommandBase {
	/**
	 * Creates a new ChassisBrake.
	 */
	public final Chassis m_chassis;
	private JoystickButton m_brakeButton;
	public ChassisBrake(Chassis chassis, JoystickButton brakeButton) {
		m_chassis = chassis;
		m_brakeButton = brakeButton;
		// Use addRequirements() here to declare subsystem dependencies.
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		if (m_brakeButton.get()) m_chassis.brake(true);
		else m_chassis.brake(false);

	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}