package ch.hslu.plab.sw06.Calculator;

import ch.hslu.plab.sw06.Calculator.Interfaces.IntegerCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerCalculatorTests {
    @Test
    public void add() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int expected = 15;
        int firstNumber = 13;
        int secondNumber = 2;

        // Act
        int actual = calc.add(firstNumber, secondNumber);

        // Arrange
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addWithNegativ() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int expected = -8;
        int firstNumber = -13;
        int secondNumber = 5;

        // Act
        int actual = calc.add(firstNumber, secondNumber);

        // Arrange
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addNegativWithNegativ() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int expected = -21;
        int firstNumber = -13;
        int secondNumber = -8;

        // Act
        int actual = calc.add(firstNumber, secondNumber);

        // Arrange
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addZeroNegativ() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int expected = -13;
        int firstNumber = -13;
        int secondNumber = 0;

        // Act
        int actual = calc.add(firstNumber, secondNumber);

        // Arrange
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void addWithOverflowGiven() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = 1;

        // Act
        calc.add(firstNumber, secondNumber);

    }

    @Test(expected = ArithmeticException.class)
    public void addWithUnderflowGiven() {
        // Arrange
        IntegerCalculator calc = new IntCalculator();
        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = -1;

        // Act
        calc.add(firstNumber, secondNumber);
    }
}