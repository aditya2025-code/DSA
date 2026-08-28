//Q1. Selection Sort(find smallest first) :

public class Task01 {
    public static int[] selecSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = i;
            for (int j = i; j <= arr.length - 1; j++) {
                // find minimum
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            // swaping
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            // check every iterition
            // for (int k = 0; k < arr.length; k++) {
            // System.out.print(arr[k] + " ");
            // }
            // System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 8, 4, 1, 9, -3, 6, 5 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        selecSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
