package chapter02_Array_Problem_Solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array02_문제풀이01_함수화 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1];
        int index = 0;

        while (true) {
            int value = Integer.parseInt(bufferedReader.readLine());

            if (index == arr.length) arr = expandArr(arr);

            arr[index] = value;

            System.out.println(Arrays.toString(arr));

            index++;
        }
    }

    public static int[] expandArr(int[] originalArr) {
        int[] newArr = new int[originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++)
            newArr[i] = originalArr[i];
        return newArr;
    }
}
