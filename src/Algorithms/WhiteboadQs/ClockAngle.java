package Algorithms.WhiteboadQs;

public final class ClockAngle {

    private static final double degPerHour = 360 / 12; // 30 degrees in one hour
    private static final double degPerMinute = 360 / 60; // 6 degrees in one minute


    public static double doWork(double hour, double min) {


        double hourCorrectionFactor = (min / 60.0) * degPerHour; //Hour hand moves as the minute hand moves

        double hourAngle = (hour * degPerHour) + hourCorrectionFactor;
        double minAngle = min * degPerMinute;

        return Math.abs(hourAngle - minAngle);
    }
}
