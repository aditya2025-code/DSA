//Q4. First & Last Occurrence: 

import java.util.ArrayList;

public class Task04 {
    public static ArrayList<Integer> firstOccur(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
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
        ans.add(res);
        low = 0;
        high = nums.length - 1;
        res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                res = mid;
                low = mid + 1;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        ans.add(res);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target = 5;
        System.out.println(firstOccur(arr, target));
    }
}
