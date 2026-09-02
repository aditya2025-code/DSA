//Q7. Maximum count of positive integer and negative integer:

public class Task07 {
    public static int maximumCount(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        int idxneg = high + 1;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        int idxpos = nums.length - low;
        return Math.max(idxneg,idxpos);
    }

    public static void main(String[] args) {
        int arr[] = { 3, -2, -1, 0, 0, 1, 2 };
        System.out.println(maximumCount(arr));
    }
}
