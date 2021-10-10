package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int startNumber = inputNumber;

        if (startNumber < 0) {
            startNumber *= -1;
            return doReverse(startNumber) * -1;
        }
        return doReverse(startNumber);
    }

    public int doReverse(int startNumber) {
        int reverseNumber = 0;
        while (startNumber > 0) {
            reverseNumber *= 10;
            reverseNumber += startNumber % 10;
            startNumber /= 10;
        }
        return reverseNumber;
    }
}
