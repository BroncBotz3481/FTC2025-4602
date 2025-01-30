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

    }

    public void moveForward(double power, int time) {
        robot.Intake.setPosition(1);


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

        sleep(950);
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

        robot.Intake.setPosition(0);  //intake open

        sleep(500);
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(-0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(500);
        //move back
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(1000);               //arm down to rest position
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        sleep(500);//turn right
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);          //turn right
        sleep(750);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);


        robot.Arm.setPower(0.6);
        robot.Arm2.setPower(0.6);
        sleep(300);               //arm up to pick up from human player
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(1500);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(800);                    //ruen right
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(1000);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(350);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
        sleep(2000);

        robot.Intake.setPosition(1);    //intake close
        sleep(1000);

        robot.Arm.setPower(0.6);
        robot.Arm2.setPower(0.6);
        sleep(1300);               //arm up
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(-0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(500);
        //move back
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(800);                //turn
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(1500);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(800);                    //turn right
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(700);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(450);               //arm down
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);


        sleep(1000);

        robot.Intake.setPosition(0); //intake open

        sleep(500);
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(-0.6);      // move back
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(0.6);
        sleep(500);
        //move back
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.Arm.setPower(-0.6);
        robot.Arm2.setPower(-0.6);
        sleep(1000);               //arm down to rest position
        robot.Arm.setPower(0);
        robot.Arm2.setPower(0);

        sleep(500);//turn right
        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);          //turn right
        sleep(750);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(1500);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        robot.DriveRightFront.setPower(-0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(-0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(800);                    //ruen right
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);

        sleep(1000);

        robot.DriveRightFront.setPower(0.8);
        robot.DriveLeftFront.setPower(0.6);
        robot.DriveRightBack.setPower(0.8);
        robot.DriveLeftBack.setPower(-0.6);
        sleep(700);                      //Move forward
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);




    }
}