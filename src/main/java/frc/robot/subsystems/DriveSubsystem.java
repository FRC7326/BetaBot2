package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.DriveManuallyCommand;
import frc.robot.ElevatorModule;

public class DriveSubsystem extends Subsystem {
  public Spark leftFrontmotor = new Spark(1);
  public Spark leftBackmotor = new Spark(2);
  public Spark RightFrontmotor = new Spark(4);
  public Spark RightBackmotor = new Spark(3);

 public static ElevatorModule Elevator;

  SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontmotor, leftBackmotor);
  SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(RightFrontmotor, RightBackmotor);
  public DifferentialDrive drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
 
  public static DoubleSolenoid Piston;
  
  public DriveSubsystem(){
    Elevator = new ElevatorModule(0);
    Piston = new DoubleSolenoid(0, 1);
  }

  

  public void manualDrive(double move, double turn){
    drive.arcadeDrive(move, turn);   
  }
  

  @Override
  public void initDefaultCommand(){
    setDefaultCommand(new DriveManuallyCommand());
  }
  public void setPiston(DoubleSolenoid.Value value){ Piston.set(value);}
}
