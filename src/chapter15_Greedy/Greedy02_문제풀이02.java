package chapter15_Greedy;

import java.io.*;
import java.util.*;

public class Greedy02_문제풀이02 {
    public static class Meeting implements Comparable<Meeting> {
        int start, end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting other) {
            // 종료 시간이 빠른 순으로 정렬
            if (this.end == other.end) {
                return this.start - other.start; // 종료 시간이 같다면 시작 시간이 빠른 순
            }
            return this.end - other.end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 회의 개수
        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = br.readLine().split(" ");
            int start = Integer.parseInt(inputData[0]);
            int end = Integer.parseInt(inputData[1]);
            meetings.add(new Meeting(start, end));
        }

        // `Comparable` 구현으로 인해 바로 정렬 가능
        Collections.sort(meetings);

        int count = 0;
        int lastEndTime = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start >= lastEndTime) {
                lastEndTime = meeting.end;
                count++;
            }
        }

        System.out.println(count);
    }
}
