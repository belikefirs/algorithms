package com.lessons.algorithms.common;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SumTwoNumbersTest {

    SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();

    @ParameterizedTest(name = "{0}")
    @MethodSource("sumTwoNumbersExample")
    void test_sumTwoNumbersExample(String testName, int[] array, int findingNumber, int[] expectedPair) {
        assertArrayEquals(expectedPair, sumTwoNumbers.getTwoNumbersGivingSumExpectedNumber(array, findingNumber));
    }

    private static Stream<Arguments> sumTwoNumbersExample() {
        return Stream.of(
                Arguments.of("null example", null, 1, new int[0]),
                Arguments.of("empty example", new int[]{}, 1, new int[0]),
                Arguments.of("one number", new int[]{1}, 1, new int[0]),
                Arguments.of("not pair", new int[]{1, 2, 3}, 6, new int[0]),
                Arguments.of("has pair", new int[]{1, 2, 3}, 4, new int[]{1, 3}),
                Arguments.of("has pair difficult", new int[]{-9, -5, -2, -1, 1, 4, 9, 11}, 3, new int[]{-1, 4})
        );
    }

}