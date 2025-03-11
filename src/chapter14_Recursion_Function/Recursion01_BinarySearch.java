package chapter14_Recursion_Function;

public class Recursion01_BinarySearch {
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int mid = (right + left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binarySearchRecursive(arr, target, left, mid - 1);
        else return binarySearchRecursive(arr, target, mid + 1, right);
    }

    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int index = binarySearchIterative(arr, target);
        System.out.println("반복문으로 찾고자 한 값\t" + target + "의 위치는 " +
                (index == -1
                        ? "존재하지 않는다"
                        : (index + " 인덱스에 있다.")
                ));

        index = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("재귀로 찾고자 한 값\t" + target + "의 위치는 " +
                (index == -1
                        ? "존재하지 않는다"
                        : (index + " 인덱스에 있다.")
                ));
    }
}