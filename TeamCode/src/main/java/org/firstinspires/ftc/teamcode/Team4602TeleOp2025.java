package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "Team4602TeleOp2025", group = "4602")
public class Team4602TeleOp2025 extends LinearOpMode {
    Team4602HM2025 robot = new Team4602HM2025();


    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        telemetry.addData("Say", "TeleOp Starting");
        telemetry.update();
        robot.DriveRightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveLeftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveRightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveLeftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //robot.Intake.setPosition(0.3); //Needs to be adjusted

        int count = 0;
        //robot.Lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.BEATS_PER_MINUTE_PARTY_PALETTE);
        waitForStart();

        while (opModeIsActive()) {
            boolean speedslow = gamepad1.right_bumper;
            double mag = speedslow ? 0.5 : 1.0;

            double y = gamepad1.left_stick_y; // Remember, this is reversed!
            double x = -gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = -gamepad1.right_stick_x;


          /*  if (robot.Touched.isPressed()) {
                telemetry.addData("Touch", robot.Touched.isPressed());
                telemetry.update();
            } */

            // hello
            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1.5);
            double frontLeftPower = (y + x + rx) / denominator;
            double backLeftPower = (y - x + rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;

            telemetry.addData("RightFront", robot.DriveRightFront.getCurrentPosition());
            telemetry.addData("RightBack", robot.DriveRightBack.getCurrentPosition());
            telemetry.addData("LeftFront", robot.DriveLeftFront.getCurrentPosition());
            telemetry.addData("LeftBack", robot.DriveLeftBack.getCurrentPosition());
            telemetry.update();

            robot.DriveLeftFront.setPower(-frontLeftPower * mag);
            robot.DriveLeftBack.setPower(backLeftPower * mag);
            robot.DriveRightFront.setPower(frontRightPower * mag);
            robot.DriveRightBack.setPower(-backRightPower * mag);

            // test arm speed to adjust a good right speed
            boolean armSlow = gamepad2.right_trigger > 0.3;
            double Slow = speedslow ? 0.6 : 1.0; // 1.0 is the default speed multiplier, 0.6 is what happens when Slow is true.

            double Arm = gamepad2.left_stick_y;
            robot.Arm.setPower(Arm * Slow);


            while (gamepad2.right_trigger > 0.3) {
                robot.addmover.setPower(-1.0);
            }
            robot.addmover.setPower(0);

            while (gamepad2.left_trigger > 0.3) {
                robot.addmover.setPower(1.0);
            }

            robot.addintake.setPower(0);
            if (gamepad2.right_trigger > 0.3) {
                robot.addintake.setPower(-1.0);
            }
            robot.addintake.setPower(0);

            if (gamepad2.left_trigger > 0.3) {
                robot.addintake.setPower(1.0);
            }
            robot.addintake.setPower(0);

            double IntakeSpeed = gamepad2.right_stick_y;
            robot.addmoverall.setPower(-IntakeSpeed);


            if (gamepad2.a) {
                robot.addmoverall.setPower(1.0); //Needs to be adjusted
            }
            if (gamepad2.b){
                robot.addmoverall.setPower(-1.0); //Needs to be adjusted
            }

//             left bumper is open*, right bumper is close*
/*          FIX THIS. Servos have a range that we call in the program  point 0 ( think of it as the min)
            And a point called 1.0 (The Max). Based on many factors, the 0 and one points can look
            very different from servo to servo. You can use a servo programmer to change theses positions
            in the real world or just make it so the servo goes in a specific point between 0 - 1
            so it goes in the right direction
*/
             if (gamepad2.right_bumper) {
                robot.Intake.setPosition(1.0); //Needs to be adjusted
            }
            if (gamepad2.left_bumper){
                robot.Intake.setPosition(0); //Needs to be adjusted
            }


        }
    }
}
