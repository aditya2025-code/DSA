//Q6. Floor in a sorted array:

public class Task06 {
    public static int floorElem(int[] arr, int x) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 11;
        System.out.println(floorElem(nums, target));
    }
}
