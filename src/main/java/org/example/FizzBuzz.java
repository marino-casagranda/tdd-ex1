package org.example;

public class FizzBuzz {

    public static String checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        if (number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 7 == 0) {
            return "Buzz";
        } else if (String.valueOf(number).contains("66")) {
            return "FizzBuzz";
        } else {
            return String.valueOf(number);
        }
    }
}

