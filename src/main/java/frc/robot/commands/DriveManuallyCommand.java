package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import static frc.robot.Robot.oi;
import static frc.robot.Robot.driveSubsystem;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class DriveManuallyCommand extends Command {
   public DriveManuallyCommand() { requires(driveSubsystem); }

  @Override
  protected void initialize() {}
  XboxController P1 = oi.Controller0; 
  DoubleSolenoid.Value Piston = Value.kOff;
  
  @Override
  protected void execute() {
    driveSubsystem.manualDrive(-1*oi.LeftY(P1), oi.RightX(P1));
    

    driveSubsystem.Elevator.MoveElevator(oi.LeftTrigger(P1)-oi.RightTrigger(P1));

    if(oi.XButton(P1)){Piston = Value.kForward;}
    
    else if(oi.YButton(P1)){Piston = Value.kReverse; }
    
    else{Piston = Value.kOff; } driveSubsystem.setPiston(Piston);
  }
  @Override
  protected boolean isFinished() { return false; }
  @Override
  protected void end() {}
  @Override
  protected void interrupted() { end(); }
}
