package chapter01_Array;

import java.io.*;

/**
 * 문제 나누기
 * 1. 사용자에게 사이즈를 입력받는다.
 * 2. 입력값으로 초기화한다.
 * 3. 합, 평균, 최소, 최대값을 계산한다.
 * 4. 3번의 값을 출력한다.
 * */
public class Array06_문제풀이03 {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 준비
        StringBuffer sb = new StringBuffer();

        // 1. 사용자에게 사이즈를 입력받는다.
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        // 2. 연달아오는 값으로 초기화한다.
        for (int index = 0;index < size;index++)
            arr[index] = Integer.parseInt(br.readLine());

        // 3. 합, 평균, 최소, 최대값을 계산한다.
        int total = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int index = 0;index < size;index++) {
            total += arr[index];
            if (arr[index] < min) min = arr[index];
            else if (arr[index] > max) max = arr[index];
        }

        // 4. 3번에 대한 출력준비
        sb.append(total).append("\n").append((double) total / size).append("\n").append(min).append("\n").append(max).append("\n");
        // 4. 출력하기
        System.out.println(sb.toString());
    }
}
