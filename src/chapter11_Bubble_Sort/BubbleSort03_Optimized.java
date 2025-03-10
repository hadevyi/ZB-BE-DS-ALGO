package chapter11_Bubble_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort03_Optimized {
    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // 더 이상 교환이 없으면 종료
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");

        int[] arr = new int[inputData.length];
        for (int i = 0;i < inputData.length;i++)
            arr[i] = Integer.parseInt(inputData[i]);

        System.out.println("정렬 전 : " + Arrays.toString(arr));
        optimizedBubbleSort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
