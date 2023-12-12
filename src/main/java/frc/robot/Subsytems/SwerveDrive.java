package frc.robot.Subsytems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveDrive extends SubsystemBase {
    public void drive(double x1, double y1, double x2) {
        double r = Math.sqrt((Constants.Drivetrain.LENGTH*Constants.Drivetrain.LENGTH) + Constants.Drivetrain.WIDTH*Constants.Drivetrain.WIDTH);

        double a = x1 - x2 * (Constants.Drivetrain.LENGTH / r);
        double b = x1 + x2 * (Constants.Drivetrain.LENGTH / r);
        double c = y1 - x2 * (Constants.Drivetrain.WIDTH / r);
        double d = y1 + x2 * (Constants.Drivetrain.WIDTH / r);
        
        double backRightSpeed = Math.sqrt ((a * a) + (d * d));
        double backLeftSpeed = Math.sqrt ((a * a) + (c * c));
        double frontRightSpeed = Math.sqrt ((b * b) + (d * d));
        double frontLeftSpeed = Math.sqrt ((b * b) + (c * c));

        double backRightAngle = Math.atan2 (a, d) / Math.PI;
        double backLeftAngle = Math.atan2 (a, c) / Math.PI;
        double frontRightAngle = Math.atan2 (b, d) / Math.PI;
        double frontLeftAngle = Math.atan2 (b, c) / Math.PI;

        
    }
}