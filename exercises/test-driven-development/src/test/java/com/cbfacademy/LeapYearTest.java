package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@DisplayName("The LeapYear class should")
public class LeapYearTest {

    public static Stream<Arguments> exercise1Arguments() {
        return Stream.of(
                Arguments.of(1900, false),
                Arguments.of(1700, false),
                Arguments.of(800, true),
                Arguments.of(2000, true),
                Arguments.of(2008, true),
                Arguments.of(1300, false),
                Arguments.of(1800,false),
                Arguments.of(2001,false),
                Arguments.of(2002,false),
                Arguments.of(2003,false),
                Arguments.of(2004,true),
                Arguments.of(2005,false),
                Arguments.of(2006,false),
                Arguments.of(2007,false),
                Arguments.of(2009,false),
                Arguments.of(2010,false),
                Arguments.of(2011,false)
                
               
               

        );
    }

//     1700 false
// 1800 false
// 1900 false
// 2000 true
// 2001 false
// 2002 false
// 2003 false
// 2004 true
// 2005 false
// 2006 false
// 2007 false
// 2008 true
// 2009 false
// 2010 false
// 2011 false

    @ParameterizedTest
    @MethodSource("exercise1Arguments")
    @DisplayName("return False when the year is 1900")

    public void falseWhen1900(Integer year, boolean expected) {
        final boolean actual = LeapYear.isALeapYear(year);

        assertThat(actual, is(expected));
    }

}
