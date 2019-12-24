import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ElevatorModule {

  public static TalonSRX chainMotor = new TalonSRX(0); 

  public void MoveElevator(double move){

    chainMotor.set(ControlMode.PercentOutput, move);}
    
    private TalonSRX mLift;

    public ElevatorModule(int kDriveID) {
      mLift = new TalonSRX(kDriveID);
    }
  
//did javi put this?
public void setSpeed(double speed) {
}
}