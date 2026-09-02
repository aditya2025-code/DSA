// Q1. Normal Binary Search:

public class Task01 {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }
}
