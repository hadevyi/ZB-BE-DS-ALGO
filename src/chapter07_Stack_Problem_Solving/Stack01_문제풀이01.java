package chapter07_Stack_Problem_Solving;

import java.io.*;
import java.util.*;

public class Stack01_문제풀이01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String inputData = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputData.toCharArray()) {

            if ('0' <= ch && ch <= '9') {
                sb.append(ch);
            } else {
                while (!stack.isEmpty() && isOperator(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }


        while (!stack.isEmpty()) { // 스택에 남은 연산자 출력
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
