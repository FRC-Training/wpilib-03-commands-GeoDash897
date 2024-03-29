/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class RunMotors extends CommandGroup {
  /**
   * Add your docs here.
   */
  public RunMotors() {
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.

    //Run Motors 1 and 2 at different speeds
    addParallel(new RunMotor1(.5));
    addSequential(new RunMotor2(1));

    //Wait 20 sec
    addSequential(new WaitCommand(20));

    //Stop Motors 1 and 2
    addParallel(new RunMotor1(0));
    addSequential(new RunMotor2(0));

    //Run Motor 3
    addSequential(new RunMotor3(1));

    //Wait 10 sec
    addSequential(new WaitCommand(10));

    //Stop Motor 3
    addSequential(new RunMotor3(0));
  }
}
