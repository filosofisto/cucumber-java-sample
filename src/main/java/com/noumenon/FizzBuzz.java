package com.noumenon;

public class FizzBuzz {

    public String play(int n) {
        boolean multipleOf3 = isMultipleOf(n, 3);
        boolean multipleOf5 = isMultipleOf(n, 5);

        if (multipleOf3 && multipleOf5) return "FizzBuzz";
        if (multipleOf3) return "Fizz";
        if (multipleOf5) return "Buzz";

        return String.valueOf(n);
    }

    private boolean isMultipleOf(int n, int divisor) {
        return n % divisor == 0;
    }
}
