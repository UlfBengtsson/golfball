package se.lexicon.ulf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Example: 45 Degrees ≈ 0.785398 Radians
     */
    @Test
    public void ConvertAngleDegreesToAngleRadians_test_45()
    {
        //Arrange
        double angle = 45;

        //Act
        double result = Golf.angleToRadius(angle);

        //Assert
        assertEquals(0.785398, result, 4);
    }

    /**
     * Example: At 45 Degrees and 56 m/s, the ball should travel 320 meters.
     */
    @Test
    public void ballDistanceTraveled_test_320_meters()
    {
        //Arrange
        double angle = 45;
        double velocity = 56;

        //Act
        double result = Golf.ballDistanceTraveled( velocity, angle );

        //Assert
        assertEquals(320.0, result, 4);
    }

    @Test
    public void ballDistanceTraveled_test_0_meters()
    {
        //Arrange
        double angle = 45;
        double velocity = 0;

        //Act
        double result = Golf.ballDistanceTraveled( velocity, angle );

        //Assert
        assertEquals(0.0, result, 4);
    }

    @Test
    public void ballDistanceTraveled_test_0_meters_90_degrees()
    {
        //Arrange
        double angle = 90;
        double velocity = 56;

        //Act
        double result = Golf.ballDistanceTraveled( velocity, angle );

        //Assert
        assertEquals(0.0, result, 4);
    }
}
