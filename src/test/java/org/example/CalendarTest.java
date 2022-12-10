package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

class CalendarTest {

    @ParameterizedTest
    @ValueSource(ints = {1825, 1910, 1955, 2002, 2021})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Calendar calendar = new Calendar(year);

        boolean expectedResult = gregorianCalendar.isLeapYear(year);
        boolean actualResult = calendar.isLeapYear();

        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1823, 1971, 202, 0, 2020})
    public void Should_return_false(int year) {
        Calendar calendar = new Calendar(year);

        boolean expectedResult = false;
        boolean actualResult = calendar.isLeapYear();

        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 1976, 1992, 1948})
    public void Should_return_true(int year) {
        Calendar calendar = new Calendar(year);

        boolean expectedResult = true;
        boolean actualResult = calendar.isLeapYear();

        assertEquals(expectedResult,actualResult);
    }

}