package com.lessons.algorithms.common;

public class Brackets {

    public boolean isValid(String brackets) {
        if (brackets == null || brackets.length() == 0) {
            return false;
        }

        int openBracketCount = 0;
        char[] bracketsArray = brackets.toCharArray();

        for (char bracket : bracketsArray) {
            if ('{' == bracket) {
                openBracketCount++;
            } else if ('}' == bracket) {
                openBracketCount--;
            } else {
                return false;
            }

            if (openBracketCount < 0) {
                return false;
            }
        }

        return openBracketCount == 0;
    }

}
