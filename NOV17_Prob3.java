public class NOV17_Prob3 {
    public static void main(String[] args) {

        System.out.println("TEST RESULTS");

        System.out.println("factorial(0): " + factorial(0)); // RESULTS: 1, PASSED
        System.out.println("factorial(1): " + factorial(1)); // RESULTS: 1, PASSED
        System.out.println("factorial(4): " + factorial(4)); // RESULTS: 24, PASSED
        System.out.println("factorial(5): " + factorial(6)); // RESULTS: 720, PASSED!!

    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}

/*
THINK FIRST — TRACE BEFORE YOU FIX
1. Hand-trace factorial(4) with the AI's code. What does it return, and
why?  It returns ZERO, making every multiplication result zero.
2. Which single line is wrong, and what should it return instead?
at "if (n == 0) { return 0; }" It should return 1 instead, cuz the factorial of zero is one.

EXPLAIN — IN YOUR OWN WORDS
1. Why did one wrong return make every result wrong?
Every recursive call eventually reaches the base case. Since it returned the wrong value or zero, all the calculations depending on it also became incorrect.
2. Stretch: what happens for factorial(-2) with your corrected code, and
why? It causes a 'StackOverflowError' since negative numbers keep decreasing and never reach the base case of n == 0. Ending with an error stack overflow msg.
 */