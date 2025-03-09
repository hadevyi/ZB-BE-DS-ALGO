package chapter08_Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Queue03_문제풀이01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");

        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0;i < N;i++)
            queue.add(i + 1);

        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");

            if (queue.isEmpty()) break;

            for (int m = 1;m < M;m++) {
                queue.offer(queue.poll());
            }
        }

        System.out.println(sb.toString());
    }
}
