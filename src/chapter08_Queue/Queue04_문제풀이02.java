package chapter08_Queue;

import java.io.*;
import java.util.*;

public class Queue04_문제풀이02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);

        for (int i = 0;i < N;i++)
            queue.add(i + 1);

        int count = 0;
        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()) {
            int size = queue.size();
            sb.append(++count).append("(").append(size).append(") : ");

            for (int i = 0;i < size;i++) {
                int value = queue.poll();
                sb.append(value).append(" ");
                int newValue = value * 10;
                if (newValue > M) continue;
                queue.add(newValue);
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
