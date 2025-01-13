package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Sanjithishim", group="4602")
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
        moveForward(0.4, 3100);
        //write code here


    }

    public void moveForward(double power, int time) {
        robot.Arm.setPower(0.8);
        robot.Arm2.setPower(0.8);
        sleep(1320);
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);
        sleep(2000);
        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(1500);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(1000);
        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(-0.8);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(0.8);
        sleep(400);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
        sleep(1500);

        robot.Intakemover.setPower(-1.0);
        robot.Intakemover2.setPower(-1.0);        
        sleep(1000);
        robot.Intakemover.setPower(0);
        robot.take.setPower(-1.0);
        sleep(3000);
        robot.take.setPower(0);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(1500);
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);


    }
}