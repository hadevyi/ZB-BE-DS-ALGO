package chapter02_Array_Problem_Solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array03_문제풀이01_간단 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1];
        int index = 0;

        while (true) {
            int value = Integer.parseInt(bufferedReader.readLine());

            if (index == arr.length) arr = Arrays.copyOf(arr, arr.length + 1);

            arr[index] = value;

            System.out.println(Arrays.toString(arr));

            index++;
        }
    }
}
