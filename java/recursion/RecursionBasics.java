/*
 Recursion Basics in Java

 Recursion is a technique where a function calls itself
 to solve a problem by reducing it to smaller subproblems.
*/

public class RecursionBasics {

    // Print numbers from 1 to n
    static void printAscending(int n) {
        if (n == 0) {          // base case
            return;
        }
        printAscending(n - 1); // recursive call
        System.out.println(n);
    }

    // Print numbers from n to 1
    static void printDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDescending(n - 1);
    }

    // Factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        printAscending(5);
        printDescending(5);
        System.out.println("Factorial: " + factorial(5));
    }
}
