package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class DriveManuallyCommand extends Command {
   public DriveManuallyCommand() { requires(Robot.driveSubsystem); }

  @Override
  protected void initialize() {}
  XboxController P1 = Robot.oi.Controller0; 
  DoubleSolenoid.Value Piston = Value.kOff;
  
  @Override
  protected void execute() {
    Robot.driveSubsystem.manualDrive(-1*Robot.oi.LeftY(P1), Robot.oi.LeftX(P1));
    
    // if(Robot.oi.BButtonDown(P1)){
    //   Robot.driveSubsystem.Elevator.MoveElevator(-0.3);
    // }
    // else if(Robot.oi.AButtonDown(P1)){
    //   Robot.driveSubsystem.Elevator.MoveElevator(0.3);
    // }
    // else{
    //   Robot.driveSubsystem.Elevator.MoveElevator(0);
    // }
    Robot.driveSubsystem.Elevator.MoveElevator(Robot.oi.LeftTrigger(P1)+Robot.oi.RightTrigger(P1));

    if(Robot.oi.XButton(P1)){Piston = Value.kForward;}
    
    else if(Robot.oi.YButton(P1)){Piston = Value.kReverse; }
    
    else{Piston = Value.kOff; } Robot.driveSubsystem.setPiston(Piston);
  }
  @Override
  protected boolean isFinished() { return false; }
  @Override
  protected void end() {}
  @Override
  protected void interrupted() { end(); }
}
