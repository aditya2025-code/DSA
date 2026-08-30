//Q1. Union of 2 sorted Arrays: 

import java.util.ArrayList;

public class Task01 {
    public static ArrayList<Integer> getUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!union.contains(arr2[i]))
                union.add(arr2[i]);
        }
        union.sort(null);
        return union;
    }

    public static void main(String[] args) {
        int a[] = { 2, 2, 3, 4, 5 }, b[] = { 1, 1, 2, 3, 4 };
        ArrayList<Integer> result = getUnion(a, b);
        System.out.println("Union Element: " + result);
    }
}
