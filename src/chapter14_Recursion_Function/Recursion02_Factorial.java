package chapter14_Recursion_Function;

public class Recursion02_Factorial {
    public static int factorial(int n) {
        if (n == 1) return 1; // 종료 조건(Base Case)
        return n * factorial(n - 1); // 재귀 호출
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 출력: 120
    }
}
