//Q2. Binary Search on ascending oder:

public class Task02 {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 4, 2, 1, 0, -2 };
        int target = 0;
        System.out.println(binarySearch(arr, target));
    }
}
