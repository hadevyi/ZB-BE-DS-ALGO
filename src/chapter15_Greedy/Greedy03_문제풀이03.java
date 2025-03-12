package chapter15_Greedy;

import java.io.*;
import java.util.*;

public class Greedy03_문제풀이03 {
    public static class Item implements Comparable<Item> {
        int weight, value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        @Override
        public int compareTo(Item other) {
            // 무게당 가치가 높은 순으로 정렬 (value/weight 비율)
            double ratio1 = (double) this.value / this.weight;
            double ratio2 = (double) other.value / other.weight;
            return Double.compare(ratio2, ratio1); // 내림차순 정렬
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputData = br.readLine().split(" ");
        int n = Integer.parseInt(inputData[0]); // 아이템 개수
        int W = Integer.parseInt(inputData[1]); // 배낭의 최대 무게
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            inputData = br.readLine().split(" ");
            int weight = Integer.parseInt(inputData[0]);
            int value = Integer.parseInt(inputData[1]);
            items.add(new Item(weight, value));
        }

        // `Comparable` 구현으로 정렬 가능 (무게당 가치 높은 순)
        Collections.sort(items);

        int totalValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= W) {
                // 전체 아이템을 넣을 수 있으면 그대로 추가
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // 일부만 넣을 경우 (Fractional Knapsack)
                int remainWeight = W - currentWeight;
                totalValue += (item.value * remainWeight) / item.weight;
                break;
            }
        }

        System.out.println(totalValue);
    }
}
