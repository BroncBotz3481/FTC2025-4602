package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.SwitchableLight;

public class Team4602HM2025 {
    public DcMotor DriveRightBack = null;
    public DcMotor DriveLeftBack = null;
    public DcMotor DriveLeftFront = null;
    public DcMotor DriveRightFront = null;

    public DcMotor addmoverall = null;
    public CRServo addmover = null;
    public CRServo addintake = null;
    public DcMotor Arm = null; //Isabella's added code
    //public DcMotor Arm2 = null; //Isabella's added code
    public Servo Intake = null; //Isabella's added code
//I fixed it



    //public NormalizedColorSensor ColorSensor = null;



    //public ElapsedTime period  = new ElapsedTime();

    // public Team4008HMNew() {}

    HardwareMap hwMap = null;
    //FIX AND USE IT
    public void Map(HardwareMap hardwareMap)
    {
        hwMap = hardwareMap;
        DriveLeftFront = hwMap.get(DcMotor.class,"DriveLeftFront");
        DriveRightFront = hwMap.get(DcMotor.class,"DriveRightFront");
        DriveLeftBack = hwMap.get(DcMotor.class,"DriveLeftBack");
        DriveRightBack = hwMap.get(DcMotor.class,"DriveRightBack");
        //   Lights = hwMap.get(RevBlinkinLedDriver.class,"Lights");

        DriveLeftFront.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightFront.setDirection(DcMotor.Direction.REVERSE);
        DriveRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveLeftBack.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightBack.setDirection(DcMotor.Direction.REVERSE);
        DriveRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


//        Turret = hwMap.get(DcMotor.class,"Turret");
//        Turret.setDirection(DcMotorSimple.Direction.REVERSE);
//        Turret.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        //IntakeLift.setDirection(DcMotor.Direction.REVERSE);

//        Elevator = hwMap.get(DcMotor.class, "Elevator");
//        Elevator.setDirection(DcMotorSimple.Direction.REVERSE);
//        Elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        Elevator.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


//Isabella's added code
        Arm = hwMap.get(DcMotor.class, "Arm");
        Arm.setDirection(DcMotorSimple.Direction.REVERSE);
        Arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Arm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //Arm2 = hwMap.get(DcMotor.class, "Arm2");
        //Arm2.setDirection(DcMotorSimple.Direction.REVERSE);
        //Arm2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //Arm2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        addmoverall = hwMap.get(DcMotor.class, "addmoverall");
        addmoverall.setDirection(DcMotorSimple.Direction.REVERSE);
        addmoverall.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        addmoverall.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Intake = hwMap.get(Servo.class, "Intake");

        addmover = hwMap.get(CRServo.class, "addmover");
        addintake = hwMap.get(CRServo.class, "addintake");
        //Arm = hwMap.get(DcMotor.class, "Arm");

//        ColorSensor = hwMap.get(NormalizedColorSensor.class, "sensor");

    }
}
