package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Sanjith is him 2.0", group="4602")
public class testauto extends LinearOpMode {

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
        moveForward(0.4, 3000);
        //write code here


    }

    public void moveForward(double power, int time) {
        robot.Arm.setTargetPosition(500);
        robot.Arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm.setPower(0.8);
        robot.Arm2.setTargetPosition(500);
        robot.Arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm2.setPower(0.8);
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
        robot.DriveLeftFront.setPower(-0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(400);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);


        robot.Intakemover.setPower(-1.0);
        sleep(1000);
        robot.Intakemover.setPower(0);
        robot.take.setPower(-1.0);
        sleep(3000);
        robot.take.setPower(0);

        robot.Arm.setTargetPosition(0);
        robot.Arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm.setPower(0.8);
        robot.Arm2.setTargetPosition(0);
        robot.Arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm2.setPower(0.8);

    }
}