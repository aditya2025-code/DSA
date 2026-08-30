//Q3. Kth smallest element:

public class Task03 {
    public static int kthSmallest(int[] arr, int k) {
        // Code here
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int swap = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("K'th element is: "+ kthSmallest(a, k));
    }
}
