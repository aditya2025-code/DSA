//Q5. Find Peak in a mountain array: 

public class Task05 {
    public static boolean peakIndex(int[] arr) {
        int low = 1, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return true;
            else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakIndex(nums));
    }
}
