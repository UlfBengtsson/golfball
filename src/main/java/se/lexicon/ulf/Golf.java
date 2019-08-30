package se.lexicon.ulf;

public class Golf {

    private static final double GRAVITY = 9.8;

    /**
     * Converts angle in degrees to angle in radians
     * (Pi / 180) * angle = angle in radians
     * @param angle in degrees
     * @return angle in radians
     */
    public static double angleToRadius(double angle)
    {
        double result = (Math.PI / 180) * angle;
        return result;
    }

    /**
     * Only based on Velocity/Gravity/Angle
     * GRAVITY = 9.8
     * Velocity^2 / GRAVITY * Sin( 2 * Angle in radians ) = Distance
     * @return Distance traveled by the ball
     */
    public static double ballDistanceTraveled(double velocity, double angle)
    {
        double result = Math.sin( 2 * angleToRadius(angle)) * Math.pow(velocity, 2) / GRAVITY;
        return result;
    }
}
