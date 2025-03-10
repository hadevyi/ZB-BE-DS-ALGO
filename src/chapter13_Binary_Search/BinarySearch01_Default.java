package chapter13_Binary_Search;

public class BinarySearch01_Default {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) { // 역전되는 순간은 데이터에 찾고자 하는 값이 없다는 것
            int mid = (left + right) / 2;

            if (arr[mid] == target) return mid; // 찾으면 바로 반환
            else if (arr[mid] < target) left = mid + 1; // 오른쪽 탐색
            else right = mid - 1; // 왼쪽 탐색
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int index = binarySearch(arr, target);
        System.out.println("값 " + target + "의 위치는 " + index);
    }
}
