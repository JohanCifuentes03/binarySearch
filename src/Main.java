public class Main {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i<= array.length - 1;i ++ ){
            array[i] = i;
        }

        int index = binarySearch(array,target);
        if(index == -1 ){
            System.out.println(target + " Not found");
        }else {
            System.out.println(target + " Found at index " + index);
        }
    }
    public static int binarySearch(int[]arr , int target){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int middle =  low + (high - low)/ 2;
            int value = arr[middle];
            if(target > value) {
                low = middle + 1 ;
            }
            else if (target<value) {
                high = middle -1 ;
            }else{
                return middle;
            }
        }
        return -1;
    }
}