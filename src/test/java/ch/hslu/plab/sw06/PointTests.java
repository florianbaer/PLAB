package ch.hslu.plab.sw06;

import org.junit.Assert;
import org.junit.Test;

public class PointTests {

    @Test
    public void movePointWithXandYPositive(){
        // Arrange
        Point point = new Point(2,23);
        Point expectedPoint = new Point(3, 27);

        // Act
        point.moveRelative(1, 4);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void movePointWithXandYPositiveAndNegative(){
        // Arrange
        Point point = new Point(45,8);
        Point expectedPoint = new Point(51, -25);

        // Act
        point.moveRelative(6, -33);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void movePointWithXandYNegative(){
        // Arrange
        Point point = new Point(44,34);
        Point expectedPoint = new Point(32, 1);

        // Act
        point.moveRelative(-12, -33);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void movePointWithXandYPositiveByPoint(){
        // Arrange
        Point point = new Point(2,23);
        Point expectedPoint = new Point(3, 27);

        // Act
        point.moveRelative(new Point(1, 4));

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void movePointWithXandYPositiveAndNegativeByPoint(){
        // Arrange
        Point point = new Point(45,8);
        Point expectedPoint = new Point(51, -25);

        // Act
        point.moveRelative(new Point(6, -33));

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void movePointWithXandYNegativeByPoint(){
        // Arrange
        Point point = new Point(44,34);
        Point expectedPoint = new Point(32, 1);

        // Act
        point.moveRelative(new Point(-12, -33));

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void moveByVecotrStraightRightTest(){
        // Arrange
        Point point = new Point(44,34);
        Point expectedPoint = new Point(54, 34);

        // Act
        point.moveByVector(Math.toRadians(0), 10);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void moveByVecotrStraightTopTest(){
        // Arrange
        Point point = new Point(44,34);
        Point expectedPoint = new Point(44, 49);

        // Act
        point.moveByVector(Math.toRadians(90), 15);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }

    @Test
    public void moveByVecotrFortyFiveDegreeTest(){
        // Arrange
        Point point = new Point(10,10);
        Point expectedPoint = new Point(17, 17);

        // Act
        point.moveByVector(Math.toRadians(45), 10);

        // Assert
        Assert.assertEquals(expectedPoint.getX(), point.getX());
        Assert.assertEquals(expectedPoint.getY(), point.getY());
    }
}
