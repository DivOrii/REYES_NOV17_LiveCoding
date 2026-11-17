
public class NOV17_Prob1 {

    public static void main(String[] args) {

        System.out.println(computeAverage(5, 2));  // Expected 2.5
        System.out.println(computeAverage(10, 0));  // Expected 0.0
        System.out.println(computeAverage(100, 8));  // Expected 12.5 
        System.out.println(computeAverage( 60, 9));  // My own test: Expected 6.666666666666667


    }

    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }

        return (double) total / count;
    }

}

/*
THINK FIRST — BEFORE ANY AI thingy
1. Inputs (types and meanings): total for the total value, and the count for the number of valuess.
2. Output type and value for normal input: double, and the average of total divided by count.
3. Special case to guard against, and what to return: If count is 0 or negative, return 0.0 to avoid dividing by zero.



EXPLAIN — IN YOUR OWN WORDS
1. Why does the method need the word double (or a cast) in the return? so the decimal's are valid and get printed out. Without it, it'll just go to x.0!!!
2. What would go wrong without the count <= 0 guard? ERRORRR, the code would not run without it.
 */
