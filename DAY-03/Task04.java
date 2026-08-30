//Q4. Common Element

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static ArrayList<Integer> commonElem(int[] arr1, int[] arr2) {
        ArrayList<Integer> commn = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length) {
            if (arr1[i] == arr2[j]) {
                commn.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return commn;
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 2, 2, 4, 5, 1, 8 }, b[] = { 3, 2, 7, 8, 1 };
        ArrayList<Integer> result = commonElem(a, b);
        System.out.println("Common Element: " + result);
    }
}
