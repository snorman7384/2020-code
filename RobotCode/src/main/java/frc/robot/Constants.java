/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class DrivetrainConstants {
        public static int leftID = 0;
        public static int rightID = 1;

        public static boolean isTankDriveSquared = true;
        public static boolean doesCheesyDrivePivot = true;
    }
    public static class SpinnerConstants {
        public static int motorID = 0;
        public static int pistonModuleID = 0;
        public static int fowardID = 0;
        public static int reverseID = 0;
        public static int motorSpeed = 1;
    }

}
