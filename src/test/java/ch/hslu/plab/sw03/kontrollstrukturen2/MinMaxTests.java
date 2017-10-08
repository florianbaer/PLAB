package ch.hslu.plab.sw03.kontrollstrukturen2;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MinMaxTests {
    @Test
    public void testGetMaxNumberSuccessful() {
        // Arrange
        int smallNumber = 3;
        int bigNumber = 5;
        int expectedResult = bigNumber;

        // Act
        int biggerNumber = MinMax.getMax(smallNumber, bigNumber);

        // Assert
        Assert.assertEquals(expectedResult, biggerNumber);
    }

    @Test
    public void testGetMinNumberSuccessful() {
        // Arrange
        int smallNumber = 45;
        int bigNumber = 654;
        int expectedResult = smallNumber;

        // Act
        int smallerNumber = MinMax.getMin(bigNumber, smallNumber);

        // Assert
        Assert.assertEquals(expectedResult, smallerNumber);
    }

    @Test
    public void testGetMinNumberEquals() {
        // Arrange
        int smallNumber = 445;
        int bigNumber = smallNumber;
        int expectedResult = smallNumber;

        // Act
        int smallerNumber = MinMax.getMin(bigNumber, smallNumber);

        // Assert
        Assert.assertEquals(expectedResult, smallerNumber);
    }


    @Test
    public void testGetMaxNumberEquals() {
        // Arrange
        int smallNumber = 4645;
        int bigNumber = smallNumber;
        int expectedResult = smallNumber;

        // Act
        int biggerNumber = MinMax.getMax(bigNumber, smallNumber);

        // Assert
        Assert.assertEquals(expectedResult, biggerNumber);
    }


    @Test
    public void testGetMaxMultipleNumbers() {
        // Arrange
        int expectedResult = 523;

        // Act
        int biggestNumber = MinMax.getMax(1, 523, 35, 23);

        // Assert
        Assert.assertEquals(expectedResult, biggestNumber);
    }

    @Test
    public void testGetMinMultipleNumbers() {
        // Arrange
        int expectedResult = 4;

        // Act
        int smallestNumber = MinMax.getMin(4, 82, 15, 29);

        // Assert
        Assert.assertEquals(expectedResult, smallestNumber);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetMaxNoNumbers() {
        // Arrange
        int expectedResult = 0;

        // Act
        int biggestNumber = MinMax.getMax();

        // Assert
        Assert.assertEquals(expectedResult, biggestNumber);
    }
}
