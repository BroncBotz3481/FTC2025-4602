package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Team4602AutoFar2025", group="4602")
public class Team4602AutoFar2025 extends LinearOpMode {

    Team4602HM2025 robot = new Team4602HM2025();
    ElapsedTime Time = new ElapsedTime();
    double multy = 0.3;

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        waitForStart();
        moveForward(0.4, 3000);
        //write code here


    }

    public void moveForward(double power, int time) {
        robot.Intake.setPosition(0);
        robot.Arm.setPower(power);
        robot.DriveRightFront.setPower(power);
        robot.DriveLeftFront.setPower(power);
        robot.DriveRightBack.setPower(power);
        robot.DriveLeftBack.setPower(power);
        robot.Intake.setPosition(1.0);
        robot.Arm.setPower(power);
        sleep(time);
        robot.Arm.setPower(0);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
        robot.Intake.setPosition(0);
    }
}