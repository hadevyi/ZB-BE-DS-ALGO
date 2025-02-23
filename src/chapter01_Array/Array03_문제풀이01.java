package chapter01_Array;

import java.io.*;
import java.util.*;

/**
 * 문제 나누기
 * 1. 사용자에게 데이터를 입력받는다
 * 2. 값을 0~10로 랜덤하게 초기화한다
 * 3. 특정 숫자를 입력받는다.
 * 4. 특정 숫자의 개수를 센다.
 * 5. 개수를 출력한다.
 * */
public class Array03_문제풀이01 {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 사이즈 입력받기
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        
        // 2. 랜덤하게 초기화하기
        Random rand = new Random();
        for (int index = 0;index < arr.length;index++)
            arr[index] = rand.nextInt(10);
        // 필요하다면 랜덤으로 초기화한 값 확인하기
        // System.out.println(Arrays.toString(arr));
        
        // 3. 특정 숫자 입력받기
        int findNumber = Integer.parseInt(br.readLine());
        
        // 4. 해당 개수 세기
        int count = 0;
        for (int index = 0;index < arr.length;index++) {
            if (arr[index] == findNumber) count++;
        }
        
        // 5. 개수 출력하기
        System.out.println(count);
    }
}
