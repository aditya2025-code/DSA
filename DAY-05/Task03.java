//Q3. First Occurrence:

public class Task03 {
    public static int firstOccur(int[] nums, int target) {
        int low = 0, high = nums.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                res = mid;
                high = mid - 1;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 1 };
        int target = 8;
        System.out.println(firstOccur(arr, target));
    }
}
