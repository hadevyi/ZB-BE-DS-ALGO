package chapter01_Array;

import java.io.*;

/**
 * 문제 나누기
 * 1. 10개의 입력을 받는다
 * 2. 총합을 구한다.
 * 3. 최소값을 구한다.
 * 4. 결과를 출력한다.
 * */
public class Array04_문제풀이02 {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        // 1. 10개를 입력받는다.
        for (int index = 0;index < arr.length;index++)
            arr[index] = Integer.parseInt(br.readLine());

        // 2. 총합을 구한다.
        int total = 0;
        for (int index = 0;index < arr.length;index++)
            total += arr[index];

        // 3. 최소값을 구한다.
        int min = arr[0];
        for (int index = 1;index < arr.length;index++) {
            if (arr[index] < min) min = arr[index];
        }

        // 4. 출력한다.
        System.out.println(total);
        System.out.println(min);
    }
}
