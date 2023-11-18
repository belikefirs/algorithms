package com.lessons.algorithms.common;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {

    Brackets brackets = new Brackets();

    @ParameterizedTest(name = "{0}")
    @MethodSource("bracketsExample")
    void test_isValid(String testName, String bracketExample, boolean isValid) {
        assertEquals(isValid, brackets.isValid(bracketExample));
    }

    private static Stream<Arguments> bracketsExample() {
        return Stream.of(
                Arguments.of("null example", null, false),
                Arguments.of("empty example", "", false),
                Arguments.of("blank example", " ", false),
                Arguments.of("has other symbol", "{a}", false),
                Arguments.of("only left bracket", "{", false),
                Arguments.of("only right bracket", "}", false),
                Arguments.of("not closed", "{{}", false),
                Arguments.of("many closes", "{}}", false),
                Arguments.of("simple example", "{}", true),
                Arguments.of("difficult example", "{}{{{}{}}}", true)
        );
    }
}