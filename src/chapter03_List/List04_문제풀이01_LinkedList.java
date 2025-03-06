package chapter03_List;

import java.io.*;
import java.util.*;

public class List04_문제풀이01_LinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        while (true) {
            String command = bufferedReader.readLine();  // 명령어 입력
            if (command.equals("E")) {
                break;  // 종료 명령
            }

            String[] parts = command.split(" ");  // 명령어와 값 분리

            if (parts[0].equals("I")) {
                int value = Integer.parseInt(parts[1]);  // 값 입력
                list.add(value);  // 값 리스트에 추가
            } else if (parts[0].equals("D")) {
                if (!list.isEmpty()) {
                    list.removeLast();  // 리스트의 마지막 값 삭제
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        if (list.isEmpty()) {
            stringBuffer.append("-1");
        } else {
            stringBuffer.append(list.getLast()).append("\n");  // 마지막 값 출력

            for (int value : list)
                stringBuffer.append(value).append(" ");  // 모든 값 출력
            stringBuffer.append("\n");

            stringBuffer.append(list.size());  // 사이즈 출력
        }

        System.out.println(stringBuffer.toString());
    }
}
