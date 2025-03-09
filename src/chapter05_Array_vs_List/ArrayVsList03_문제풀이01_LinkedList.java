package chapter05_Array_vs_List;

import java.io.*;
import java.util.*;

public class ArrayVsList03_문제풀이01_LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 원본 리스트 입력 받기
        String[] input = br.readLine().split(" ");
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        // 두 번째 줄: 삽입할 값과 인덱스 입력
        String[] insertInput = br.readLine().split(" ");
        int insertValue = Integer.parseInt(insertInput[0]);
        int insertIndex = Integer.parseInt(insertInput[1]);

        // LinkedList도 add(index, value)로 바로 삽입 가능
        list.add(insertIndex, insertValue);

        System.out.println(list); // 출력 예: [10, 15, 20, 30]
    }
}
