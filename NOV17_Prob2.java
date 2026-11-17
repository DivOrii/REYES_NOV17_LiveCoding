public class NOV17_Prob2 {
    public static void main(String[] args) {

        int[] grades1 = {60, 75, 88, 74, 91}; 
        int[] grades2 = {};
        int[] grades3 = {70, 69, 80};
        int[] grades4 = {50, 85, 90, 65}; // my own

      
        System.out.println("Loop: " + countPassing(grades1, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades1, 75, 0)); // EXPECTED LOOP: 3, MATCHED

        System.out.println("Loop: " + countPassing(grades2, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades2, 75, 0)); // EXPECTED LOOP: 0, MATCHED

        System.out.println("Loop: " + countPassing(grades3, 70));
        System.out.println("Recursive: " + countPassingRecursive(grades3, 70, 0)); // EXPECTED LOOP: 2, MATCHED

        // Own test
        System.out.println("Loop: " + countPassing(grades4, 80));
        System.out.println("Recursive: " + countPassingRecursive(grades4, 80, 0)); // EXPECTED LOOP: 2, MATCHED
    }

    // PART A, WITH LOOPSS
    static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // PART B, with recursivee, no loopss
    static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index >= grades.length) {
            return 0;
        }

        if (grades[index] >= passingMark) {
            return 1 + countPassingRecursive(grades, passingMark, index + 1);
        }

        return countPassingRecursive(grades, passingMark, index + 1);
    }
}

/*
THINK FIRST — NAME THE RECURSION BEFORE AI HELPS
1. Base case (when does the recursion stop?):  When the index reaches the length of the array, there would be no more grades to check.
2. Recursive case (smaller problem each call):   Check if the current grade passed, then move to the next index until all grades are checked.
3. Result for an empty array {}, and why:   It returns 0 since it doesn't have anything to count.



EXPLAIN — IN YOUR OWN WORDS
1. What does each recursive call do to index, and why must it change?
Each call adds 1 to the index so it can check the next grade in the array. It must change so the method can move forward and eventually check all the grades.

2. What happens if you delete the base case entirely?
The method will keep calling itself without stopping, which can cause a stack overflow error because it never reaches an ending condition. for short.. ERROR!
 */
