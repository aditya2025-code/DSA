//Q2. Bubble Sort:


public class Task02 {
    public static int[] bubbleSort(int[] arr) {
        // Implementation of bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, -2, 7};
        int[] sortedArr = bubbleSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
