package chapter01_Array;

import java.util.*;
import java.util.stream.IntStream;

public class Array01_초기화 {
    public static void main(String[] args)  {
        // 1. 가장 일반적인 초기화 방법
        int[] arr01 = new int[5];
        System.out.println(Arrays.toString(arr01));

        // 2. 선언과 동시에 초기화하는 방법
        int[] arr02 = {3, 5, 2, 9, 10};
        System.out.println(Arrays.toString(arr02));

        // 3. 반복문을 활용한 초기화
        int[] arr03 = new int[5];
        Random rand = new Random();
        for (int index = 0;index < arr03.length;index++)
            arr03[index] = rand.nextInt(10);
        System.out.println(Arrays.toString(arr03));

        // 4. Arrays fill 활용하기
        int[] arr04 = new int[5];
        Arrays.fill(arr04, 100);
        System.out.println(Arrays.toString(arr04));

        // 5. Stream 문법 활용하기
        int[] arr05 = IntStream.range(0, 5).toArray();
        System.out.println(Arrays.toString(arr05));

    }
}
