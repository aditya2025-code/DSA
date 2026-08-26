//Q4. Bubble Sort(reversed): 

public class Task04 {
    public static int[] bubbleSort(int[] arr) {
        // Implementation of bubble sort reversed algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int swapped = 0; // Flag to check if any swapping occurred
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    swapped = 1; // Set the flag to indicate that a swap occurred
                }
            }
            if (swapped == 0) { // If no swapping occurred in the inner loop, the array is already sorted
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 6  };
        int[] sortedArr = bubbleSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
