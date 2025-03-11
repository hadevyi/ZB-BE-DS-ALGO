package chapter14_Recursion_Function;

public class Recursion01_BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1; // 종료 조건

        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid; // 찾은 경우
        else if (arr[mid] < target) return binarySearch(arr, mid + 1, right, target); // 오른쪽 탐색
        else return binarySearch(arr, left, mid - 1, target); // 왼쪽 탐색
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int index = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("찾고자 한 값 " + target + "의 위치는 " +
                (index == -1
                        ? "존재하지 않는다"
                        : (index + " 인덱스에 있다.")
                ));
    }
}