package chapter14_Recursion_Function;

public class Recursion04_Hanoi {
    public static void hanoi(int n, char from, char to, char temp) {
        if (n == 1) {
            System.out.println("원반 1을 " + from + "에서 " + to + "(으)로 이동");
            return;
        }
        hanoi(n - 1, from, temp, to);
        System.out.println("원반 " + n + "을 " + from + "에서 " + to + "(으)로 이동");
        hanoi(n - 1, temp, to, from);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
}
