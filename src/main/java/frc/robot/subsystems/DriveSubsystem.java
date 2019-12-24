/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;



public class DriveSubsystem extends Subsystem {
 public Spark leftFrontmotor = new Spark(RobotMap.LeftfrontMotorPort);
 public Spark leftBackmotor = new Spark(RobotMap.LeftbackMotorPort);
 public Spark RightFrontmotor = new Spark(RobotMap.rightfrontMotorPort);
 public Spark RightBackmotor = new Spark(RobotMap.rightbackMotorPort);


SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontmotor, leftBackmotor);

SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(RightFrontmotor, RightBackmotor);

 public DifferentialDrive drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
 

public DriveSubsystem(){

}

public void manualDrive(double move, double turn){
  drive.arcadeDrive(move, turn);   
  //L(x-y)
  //R(x+y)
}

@Override
 public void initDefaultCommand(){
   setDefaultCommand(new DriveManuallyCommand());
 }
}
