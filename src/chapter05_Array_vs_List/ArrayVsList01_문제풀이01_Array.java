package chapter05_Array_vs_List;

import java.io.*;
import java.util.*;

public class ArrayVsList01_문제풀이01_Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 원본 배열 입력 받기
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 두 번째 줄: 삽입할 값과 인덱스 입력
        String[] insertInput = br.readLine().split(" ");
        int insertIndex = Integer.parseInt(insertInput[0]);
        int insertValue = Integer.parseInt(insertInput[1]);

        // 새로운 배열 생성 (크기 증가)
        int[] newArr = new int[arr.length + 1];

        // 기존 배열에서 삽입 위치 전까지 복사
        for (int i = 0; i < insertIndex; i++) {
            newArr[i] = arr[i];
        }

        // 삽입할 값 추가
        newArr[insertIndex] = insertValue;

        // 기존 배열에서 삽입 위치 이후 복사
        for (int i = insertIndex; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr)); // [10, 15, 20, 30]
    }
}
