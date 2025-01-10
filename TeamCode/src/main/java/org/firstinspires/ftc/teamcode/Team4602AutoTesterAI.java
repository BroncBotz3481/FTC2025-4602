package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Eli Auto", group="4602")
public class Team4602AutoFar2025 extends LinearOpMode {

    Team4602HM2025 robot = new Team4602HM2025();
    ElapsedTime Time = new ElapsedTime();
    double multy = 0.3;

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        robot.Arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.Arm2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.Arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.Arm2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();
        //write code here


    }package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Into the Deep Autonomous with Intake", group = "FTC")
public class IntoTheDeepAutonomousWithIntake extends LinearOpMode {

    // Declare hardware
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor arm;
    private DcMotor arm2;
    private DcMotor Intakemover;
    private Servo scoringServo;

    // Constants for motor and servo power/positions
    private static final double DRIVE_SPEED = 0.6;
    private static final double TURN_SPEED = 0.5;
    private static final double ARM_SPEED_UP = 0.7;
    private static final double ARM_SPEED_DOWN = -0.5;
    private static final double INTAKE_SPEED = 0.8;
    private static final double SCORING_POSITION = 0.7;
    private static final double RESET_POSITION = 0.3;

    @Override
    public void runOpMode() {
        // Initialize hardware
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");
        arm = hardwareMap.get(DcMotor.class, "arm");
        arm2 = hardwareMap.get(DcMotor.class, "arm2");
        Intakemover = hardwareMap.get(DcMotor.class, "Intakemover");
        scoringServo = hardwareMap.get(Servo.class, "scoring_servo");

        // Set motor directions for proper movement
        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        arm.setDirection(DcMotor.Direction.FORWARD);
        arm2.setDirection(DcMotor.Direction.REVERSE); // Reverse if motors are mirrored

        // Wait for the game to start
        telemetry.addData("Status", "Ready for Start");
        telemetry.update();
        waitForStart();

        if (opModeIsActive()) {
            // Step 1: Drive to object location
            driveForward(DRIVE_SPEED, 1500);

            // Step 2: Run intake to grab object
            moveIntake(INTAKE_SPEED, 1000);

            // Step 3: Lift the arm
            moveArm(ARM_SPEED_UP, 1000);

            // Step 4: Score object
            scoreObject();

            // Step 5: Lower the arm
            moveArm(ARM_SPEED_DOWN, 1000);

            // Step 6: Drive to parking zone
            driveForward(DRIVE_SPEED, 2000);

            // Step 7: Park in designated zone
            turnRight(TURN_SPEED, 700);
            driveForward(DRIVE_SPEED, 1000);

            // End of autonomous routine
            telemetry.addData("Status", "Autonomous Complete");
            telemetry.update();
        }
    }

    // Method to drive forward for a set duration
    private void driveForward(double power, long timeMillis) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        sleep(timeMillis);
        stopMotors();
    }

    // Method to turn right for a set duration
    private void turnRight(double power, long timeMillis) {
        leftMotor.setPower(power);
        rightMotor.setPower(-power);
        sleep(timeMillis);
        stopMotors();
    }

    // Method to stop motors
    private void stopMotors() {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }

    // Method to move the arm
    private void moveArm(double power, long timeMillis) {
        arm.setPower(power);
        arm2.setPower(power);
        sleep(timeMillis);
        arm.setPower(0);
        arm2.setPower(0);
    }

    // Method to run the intake
    private void moveIntake(double power, long timeMillis) {
        Intakemover.setPower(power);
        sleep(timeMillis);
        Intakemover.setPower(0);
    }

    // Method to operate scoring mechanism
    private void scoreObject() {
        scoringServo.setPosition(SCORING_POSITION);
        sleep(1000);  // Allow time for scoring
        scoringServo.setPosition(RESET_POSITION);
    }
}
l;,
}
