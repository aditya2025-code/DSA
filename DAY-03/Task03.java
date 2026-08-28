//Q3. 2 Sum:Find a pair with given sum(O(n log n)): 

// OUTPUT:
// How much element want to insert: 7
// Enter the array elements:
// 7 0 4 3 2 8 10
// Enter the SUM: 9
// true

import java.util.*;;

public class Task03 {
    public static boolean twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        // this is checking for everything is OK
        // System.out.println(arr[i] + arr[j]);
        // for (int k = 0; k < arr.length; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target)
                return true;
            else if (sum > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much element want to insert: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the SUM: ");
        int target = sc.nextInt();
        System.out.println(twoSum(a, target));
        sc.close();
    }
}
