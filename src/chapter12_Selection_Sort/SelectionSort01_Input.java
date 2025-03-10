package chapter12_Selection_Sort;

import java.io.*;
import java.util.*;

public class SelectionSort01_Input {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // 현재 위치를 최소값 인덱스로 설정

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // 더 작은 값이 있으면 최소값 업데이트
                    minIndex = j;
                }
            }

            // 최소값을 현재 위치(i)와 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int[] arr = new int[inputData.length];
        
        for (int i = 0;i < inputData.length;i++)
            arr[i] = Integer.parseInt(inputData[i]);

        System.out.println("정렬 전 : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
