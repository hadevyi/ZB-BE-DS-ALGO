package chapter10_Stack_vs_Queue;

import java.io.*;
import java.util.*;

public class StackVsQueue02_문제풀이02 {
    public static void sortQueue(Queue<Integer> queue) {
        int size = queue.size();
        
        for (int i = 0; i < size; i++) {
            int current = queue.poll();

            // current를 올바른 위치에 삽입
            // queue의 모든 원소를 확인하며 current보다 작은 값은 queue에 다시 넣기
            int innerSize = queue.size();
            for (int j = 0; j < innerSize; j++) {
                int temp = queue.poll();
                if (temp < current) {
                    queue.offer(temp);  // current보다 작은 값은 뒤로 보낸다.
                } else {
                    queue.offer(current);  // current를 적절한 위치에 삽입
                    current = temp;  // current를 갱신
                }
            }
            // current가 queue의 끝에 오도록 하는 부분
            queue.offer(current);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");

        Queue<Integer> queue = new LinkedList<>();
        for (String data : inputData) {
            queue.offer(Integer.parseInt(data));
        }

        sortQueue(queue);

        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        System.out.println(sb.toString());
    }
}
