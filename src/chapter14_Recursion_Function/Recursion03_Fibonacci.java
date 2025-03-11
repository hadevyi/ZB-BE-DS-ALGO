package chapter14_Recursion_Function;

public class Recursion03_Fibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(5));
        System.out.println(fibonacciRecursive(5));
    }
}
