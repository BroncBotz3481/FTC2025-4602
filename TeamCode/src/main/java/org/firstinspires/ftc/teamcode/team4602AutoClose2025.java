package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Team4602AutoClose2025", group="4602")
public class team4602AutoClose2025 extends LinearOpMode{

    Team4602HM2025 robot = new Team4602HM2025();
    ElapsedTime Time = new ElapsedTime();
    double multy = 0.3;

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        waitForStart();
        moveRight(0.4, 1500);   //moves right
        //write code here




    }
    public void moveRight (double power, int time){
        robot.Intake.setPosition(0);
        robot.Arm.setPower(power);
        robot.DriveRightFront.setPower(-power);
        robot.DriveLeftFront.setPower(-power);
        robot.DriveRightBack.setPower(-power);
        robot.DriveRightBack.setPower(-power);
        robot.Intake.setPosition(1.0);
        robot.Arm.setPower(-power);
        sleep(time);
        robot.Arm.setPower(0);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.Intake.setPosition(0);
    }
}