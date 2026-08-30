//Q2. Intersection of Arrays with Distinct: 

import java.util.Arrays;

public class Task02 {
    public static int intersectDistict(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0, count = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                count++;
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 3, 5, 6 }, b[] = { 3, 4, 5, 6, 7};
        System.out.println("Intersection of Arrays with Distinct: " + intersectDistict(a, b));
    }
}
