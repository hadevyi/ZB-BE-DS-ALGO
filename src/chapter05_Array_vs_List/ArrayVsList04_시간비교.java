package chapter05_Array_vs_List;

import java.util.*;

public class ArrayVsList04_시간비교 {
    public static void main(String[] args) {
        // 각 자료구조를 초기화
        int size = 1000000;

        // Array
        int[] array = new int[size];

        // ArrayList
        List<Integer> arrayList = new ArrayList<>(size);

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // 성능 비교용 시간 기록
        long startTime, endTime;

        // 1. 배열(Array) 값 초기화
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        endTime = System.nanoTime();
        System.out.println("Array\t\t초기화 시간 : " + (endTime - startTime) + "ns");

        // 2. ArrayList 값 초기화
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList\t초기화 시간 : " + (endTime - startTime) + "ns");

        // 3. LinkedList 값 초기화
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList\t초기화 시간 : " + (endTime - startTime) + "ns");

        // 4. 배열에서 값 읽기
        startTime = System.nanoTime();
        int arrayValue = array[size - 1];
        endTime = System.nanoTime();
        System.out.println("Array\t\t값 접근 시간 : " + (endTime - startTime) + "ns");

        // 5. ArrayList에서 값 읽기
        startTime = System.nanoTime();
        int arrayListValue = arrayList.get(size - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList\t값 접근 시간 : " + (endTime - startTime) + "ns");

        // 6. LinkedList에서 값 읽기
        startTime = System.nanoTime();
        int linkedListValue = linkedList.get(size - 1);
        endTime = System.nanoTime();
        System.out.println("LinkedList\t값 접근 시간 : " + (endTime - startTime) + "ns");

        // 7. ArrayList에 값 추가
        startTime = System.nanoTime();
        arrayList.add(1000001);
        endTime = System.nanoTime();
        System.out.println("ArrayList\t값 추가 시간 : " + (endTime - startTime) + "ns");

        // 8. LinkedList에 값 추가
        startTime = System.nanoTime();
        linkedList.add(1000001);
        endTime = System.nanoTime();
        System.out.println("LinkedList\t값 추가 시간 : " + (endTime - startTime) + "ns");

        // 9. ArrayList에서 값 삭제
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList\t값 삭제 시간 : " + (endTime - startTime) + "ns");

        // 10. LinkedList에서 값 삭제
        startTime = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("LinkedList\t값 삭제 시간 : " + (endTime - startTime) + "ns");
    }
}
