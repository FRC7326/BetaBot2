package frc.robot;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
  public static final double DEADZONE_LIMIT = 0.1;
  public XboxController Controller0 = new XboxController(0);

  public double LeftX (XboxController Controller){double raw = Controller.getRawAxis(0);return Math.abs(raw)< DEADZONE_LIMIT ? 0.0 : raw;}
  public double LeftY (XboxController Controller){double raw = Controller.getRawAxis(1);return Math.abs(raw)< DEADZONE_LIMIT ? 0.0 : raw;}
  public boolean AButtonDown(XboxController Controller){return Controller.getAButton();}
  public boolean BButtonDown(XboxController Controller){return Controller.getBButton();}
  public boolean XButton        (XboxController Controller){ return Controller.getXButtonPressed(); }
  public boolean YButton        (XboxController Controller){ return Controller.getYButtonPressed(); }
}

