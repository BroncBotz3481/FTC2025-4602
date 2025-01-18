package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name="Specimen Auto", group="4602")
public class SpecimenAuto extends LinearOpMode {

    Team4602HM2025 robot = new Team4602HM2025();
    ElapsedTime Time = new ElapsedTime();
    double multy = 0.3;

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);

        waitForStart();
        moveForward(0.4, 3000);
        //write code here
        robot.Arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.Arm2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.Arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.Arm2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
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
        sleep(800);               //Arm Up
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        sleep(1000);
        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(950);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(1000);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(300);               //arm down
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);


        sleep(1000);

        robot.Intake.setPosition(0);
        sleep(500);
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(-0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(1000);

        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(1000);               //arm down
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);
        robot.Arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.Arm2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        sleep(500);//turn right
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(750);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.Arm.setTargetPosition(500);
        robot.Arm2.setTargetPosition(500);
        robot.Arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.Arm.setPower(0.5);
        robot.Arm2.setPower(0.5);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(950);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);



//        sleep(250);
//        robot.DriveRightFront.setPower(0.8);
//        robot.DriveLeftFront.setPower(0.6);
//        robot.DriveRightBack.setPower(0.8);
//        robot.DriveLeftBack.setPower(-0.6);
//        sleep(750);                      //Move forward
//        robot.DriveRightFront.setPower(0);
//        robot.DriveLeftFront.setPower(0);
//        robot.DriveRightBack.setPower(0);
//        robot.DriveLeftBack.setPower(0);

//        sleep(500);//turn left
//        robot.DriveLeftFront.setPower(0.8);
//        robot.DriveLeftBack.setPower(-0.8);
//        sleep(2000);
//        robot.DriveRightFront.setPower(0);
//        robot.DriveLeftFront.setPower(0);
//        robot.DriveRightBack.setPower(0);
//        robot.DriveLeftBack.setPower(0);


//        robot.Arm.setPower(0.6);
//        robot.Arm2.setPower(0.6);
//        sleep(750);               //Arm Up
//        robot.Arm.setPower(0);
//        robot.Arm2.setPower(0);
//        robot.Intake.setPosition(1);
//
//        sleep(250);
//        robot.DriveRightFront.setPower(0.8);
//        robot.DriveLeftFront.setPower(0.6);
//        robot.DriveRightBack.setPower(0.8);
//        robot.DriveLeftBack.setPower(-0.6);
//        sleep(450);                      //Move forward
//        robot.DriveRightFront.setPower(0);
//        robot.DriveLeftFront.setPower(0);
//        robot.DriveRightBack.setPower(0);
//        robot.DriveLeftBack.setPower(0);
//        sleep(5000);
//        robot.Intake.setPosition(0);

    }
}