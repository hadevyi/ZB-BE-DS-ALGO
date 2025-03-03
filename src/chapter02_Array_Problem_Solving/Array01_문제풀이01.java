package chapter02_Array_Problem_Solving;

import java.io.*;
import java.util.*;

public class Array01_문제풀이01 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1];
        int index = 0;

        while (true) {
            int value = Integer.parseInt(bufferedReader.readLine());

            if (index == arr.length) {
                int[] newArr = new int[arr.length + 1];
                for (int i = 0;i < arr.length;i++)
                    newArr[i] = arr[i];
                arr = newArr;
            }

            arr[index] = value;

            System.out.println(Arrays.toString(arr));

            index++;
        }

    }
}
