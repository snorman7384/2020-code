/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DrivetrainConstants.*;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  private WPI_TalonSRX m_leftMasterMotor;
  private WPI_VictorSPX m_leftSlaveMotor;
  private WPI_TalonSRX m_rightMasterMotor;
  private WPI_VictorSPX m_rightSlaveMotor;

  private DifferentialDrive m_drive;
  
  public Drivetrain() {
    
    //set up drive motors;
    m_leftMasterMotor = new WPI_TalonSRX(leftID);
    m_leftSlaveMotor = new WPI_VictorSPX(leftID);

    m_leftMasterMotor.setInverted(isLeftInverted);
    m_leftSlaveMotor.setInverted(isLeftInverted);

    m_leftSlaveMotor.follow(m_leftMasterMotor);

    m_rightMasterMotor = new WPI_TalonSRX(rightID);
    m_rightSlaveMotor = new WPI_VictorSPX(rightID);

    m_rightMasterMotor.setInverted(isRightInverted);
    m_rightSlaveMotor.setInverted(isRightInverted);

    m_rightSlaveMotor.follow(m_rightMasterMotor);

    m_drive = new DifferentialDrive(m_leftMasterMotor, m_rightMasterMotor);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void resetEncoderPositions() {
    m_leftMasterMotor.setSelectedSensorPosition(0);
    m_rightMasterMotor.setSelectedSensorPosition(0);
  }

  public void tankDrive(double left, double right) {
    m_drive.tankDrive(left, right, isTankDriveSquared);
  }

  public void cheesyDrive(double velocity, double angle) {
    m_drive.curvatureDrive(velocity, angle, doesCheesyDrivePivot);
  }
}
