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

// Implement test cases for the equivalent partitions
}