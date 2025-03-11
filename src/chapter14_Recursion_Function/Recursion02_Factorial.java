package chapter14_Recursion_Function;

public class Recursion02_Factorial {
    public static int factorialRecursive(int n) {
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }
}
