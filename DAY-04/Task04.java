//Q4. Insertion Sort 

public class Task04 {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int swap = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 3, 9, 7 };
        insertionSort(a);
        System.out.println("Insertion Sort");
        for (int elem : a) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
