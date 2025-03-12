package chapter15_Greedy;

import java.io.*;
import java.util.*;

public class Greedy01_문제풀이01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10};
        int count = 0;

        for (int coin : coins) {
            count += amount / coin;     // 해당 동전으로 거슬러 줄 개수
            amount %= coin;             // 남은 금액
        }

        System.out.println(count);
    }
}
