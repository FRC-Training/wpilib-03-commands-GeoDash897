/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Three TalonSRX motor controllers
 */
public class MySubsystem extends Subsystem {
  //Declare Components
  TalonSRX motor1, motor2, motor3;

  //Constructor
  public MySubsystem() {
    //Initialize TalonSRX motor controllers
    motor1 = new TalonSRX(RobotMap.motor1CanID);
    motor2 = new TalonSRX(RobotMap.motor2CanID);
    motor3 = new TalonSRX(RobotMap.motor3CanID);
  }

  public void RunMotor1(double speed) {
    motor1.set(ControlMode.PercentOutput, speed);
  }

  public void RunMotor2(double speed) {
    motor2.set(ControlMode.PercentOutput, speed);
  }

  public void RunMotor3(double speed) {
    motor3.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
