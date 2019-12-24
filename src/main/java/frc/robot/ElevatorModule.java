package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ElevatorModule {    
  private TalonSRX mLift;
  public ElevatorModule(int kDriveID) {
    mLift = new TalonSRX(kDriveID);
  }
  public void MoveElevator(double move){
    mLift.set(ControlMode.PercentOutput, move);
  }
}