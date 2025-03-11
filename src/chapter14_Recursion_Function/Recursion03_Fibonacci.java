package chapter14_Recursion_Function;

public class Recursion03_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n; // 종료 조건(Base Case)
        return fibonacci(n - 1) + fibonacci(n - 2); // 재귀 호출
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // 출력: 5
    }
}
