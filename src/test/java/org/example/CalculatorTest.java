package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        int expectedResult = 2+3;
        int actualResult = calculator.add(2, 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_subtract_two_numbers_and_return_result() {
        int expectedResult = 2-3;
        int actualResult = calculator.sub(2, 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        int expectedResult = 2*3;
        int actualResult = calculator.multiply(2, 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        float expectedResult = (float) 2/3;
        float actualResult = calculator.divide(2, 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        Exception actualResult = assertThrows(ArithmeticException.class, () ->{
            calculator.divide(2, 0);
        });

        String expectedMessage = "ZeroDivisionError";
        String actualMessage = actualResult.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}