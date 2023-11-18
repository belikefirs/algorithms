package com.lessons.algorithms.common;

public class SumTwoNumbers {

    public int[] getTwoNumbersGivingSumExpectedNumber(int[] sortedNumbers, int expected) {
        if (sortedNumbers == null || sortedNumbers.length < 2) {
            return new int[0];
        }

        int left = 0, rigth = sortedNumbers.length - 1;

        while (left < rigth) {
            int leftValue = sortedNumbers[left];
            int rightValue = sortedNumbers[rigth];
            int sum = leftValue + rightValue;

            if (expected == sum) {
                return new int[]{leftValue, rightValue};
            }
            if (expected < sum) {
                rigth--;
            } else {
                left++;
            }
        }

        return new int[0];
    }

}
