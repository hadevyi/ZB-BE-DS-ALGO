package chapter11_Bubble_Sort;

import java.util.*;

public class BubbleSort01_Default {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("정렬 전 : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
