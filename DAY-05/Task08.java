//Q8. Square Root: 

public class Task08 {
    public static int sqrt(int x) {
        if (x == 0)
            return 0;
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == x/mid)
                return mid;
            else if (mid > x/mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(2147395599));
    }
}
