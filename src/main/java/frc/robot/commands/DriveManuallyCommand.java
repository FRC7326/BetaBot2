package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


import edu.wpi.first.wpilibj.XboxController;

public class DriveManuallyCommand extends Command {
   public DriveManuallyCommand() { requires(Robot.driveSubsystem); }

  @Override
  protected void initialize() {}
  XboxController P1 = Robot.oi.Controller0; 
  
  @Override
  protected void execute() {
    Robot.driveSubsystem.manualDrive(-1*Robot.oi.LeftY(P1), Robot.oi.LeftX(P1));

    if(Robot.oi.BButtonDown(P1)){
      Robot.driveSubsystem.Elevator.MoveElevator(-0.3);
    }
    else if(Robot.oi.AButtonDown(P1)){
      Robot.driveSubsystem.Elevator.MoveElevator(0.3);
    }
    else{
      Robot.driveSubsystem.Elevator.MoveElevator(0);
    }
  }
  @Override
  protected boolean isFinished() { return false; }
  @Override
  protected void end() {}
  @Override
  protected void interrupted() { end(); }
}
