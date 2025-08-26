package Three;

public class FibonacciRecursion {

    // Recursive function to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;   // base case
        } else if (n == 1) {
            return 1;   // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursion
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: print first 10 terms

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

