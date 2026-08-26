//From here i'll continue DSA in java & try to stay consistent 

//Q1. Check array is sorted nor not:

class Task01{
    public static void main(String[] args) {
        int a[] = {2,3,4,5,7,6}; //false
        int b[] = {1,2,3,4,5,6}; //true
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
    }

    public static boolean isSorted(int[] arr){
        
        for(int i = 0; i < arr.length-1 ;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

}