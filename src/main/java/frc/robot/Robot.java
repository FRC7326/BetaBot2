package frc.robot;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.DriveSubsystem;

public class Robot extends TimedRobot {
  public static DriveSubsystem driveSubsystem = new DriveSubsystem();
  public static OI oi;
  Compressor c0 = new Compressor(0);
  
  @Override
  public void robotInit() { oi = new OI();
  c0.setClosedLoopControl(true);
  }
  @Override
  public void robotPeriodic() {}
  @Override
  public void disabledInit() {}
  @Override
  public void disabledPeriodic() {}
  @Override
  public void autonomousInit() {}
  @Override
  public void autonomousPeriodic() { Scheduler.getInstance().run();}
  @Override
  public void teleopInit() {}
  @Override
  public void teleopPeriodic() { Scheduler.getInstance().run(); 
  if(oi.)
  }
  @Override
  public void testPeriodic() { }
}
