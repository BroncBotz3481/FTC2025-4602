package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Specimen Auto", group="4602")
public class testauto extends LinearOpMode {

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
        robot.Intake.setPosition(1);
        sleep(5000);


//        robot.DriveRightFront.setPower(0.8); //Frontleft & backright go the same way others go opposite for strafing
//        robot.DriveLeftFront.setPower(-0.6);
//        robot.DriveRightBack.setPower(-0.8);
//        robot.DriveLeftBack.setPower(-0.6);
//        sleep(1);                //strafe
//        robot.DriveRightFront.setPower(0);
//        robot.DriveLeftFront.setPower(0);
//        robot.DriveRightBack.setPower(0);
//        robot.DriveLeftBack.setPower(0);

        robot.Arm.setPower(0.6);
        robot.Arm2.setPower(0.6);
        sleep(1000);               //Arm Up
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        sleep(1000);
        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(1000);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(1000);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(500);               //arm downb
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        sleep(1000);

        robot.Intake.setPosition(0);
        sleep(1000);
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(-0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(1000);                      //Move backward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(500);
        robot.DriveRightFront.setPower(-0.8); //Frontleft & backright go the same way others go opposite for strafing
        robot.DriveLeftFront.setPower(0.8);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(0.8);
        sleep(750);                //strafe
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
      robot.DriveLeftBack.setPower(0);

    }
}