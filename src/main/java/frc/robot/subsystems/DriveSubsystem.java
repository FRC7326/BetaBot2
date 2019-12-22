/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;



public class DriveSubsystem extends Subsystem {
 public static Spark leftFrontmotor = new Spark(RobotMap.LeftfrontMotorPort);
 public Spark leftBackmotor = new Spark(RobotMap.LeftbackMotorPort);
 public Spark RightFrontmotor = new Spark(RobotMap.rightfrontMotorPort);
 public Spark RightBackmotor = new Spark(RobotMap.rightbackMotorPort);


SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontmotor, leftBackmotor);

SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(RightFrontmotor, RightBackmotor);

 public DifferentialDrive drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
 
//Elevator:

 //speedcontrollergroup, watch betawolves java part 4 1:30
public DriveSubsystem(){

}



public void MoveElevator(double move){
  chainMotor.set(ControlMode.PercentOutput, move);


}
public void manualDrive(double move, double turn){
  if (Math.abs(move) < .1){move = 0;}
  if (Math.abs(turn) < .1){ turn = 0;}
  drive.arcadeDrive(move, turn);
}


    
    
  


 

@Override
 public void initDefaultCommand(){
   setDefaultCommand(new DriveManuallyCommand());
 }
}
