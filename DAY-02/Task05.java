//Q4. Move all zero to end: 

public class Task05 {
    public static int[] bubbleSort(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] == 0) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -3, 0, 0, 2, 4, 0, 5, 6 };
        int[] sortedArr = bubbleSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
