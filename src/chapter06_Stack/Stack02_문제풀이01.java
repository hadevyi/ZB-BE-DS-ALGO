package chapter06_Stack;

import java.io.*;
import java.util.*;

public class Stack02_문제풀이01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 스택 생성 및 문자 삽입
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 스택에서 꺼내면서 문자열 뒤집기
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // 결과 출력
        System.out.println(reversed.toString());
    }
}
