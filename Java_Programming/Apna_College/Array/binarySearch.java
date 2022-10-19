public class binarySearch {
    public static int getBinarySearchIndex(int numbers[],int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end ) {
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            }else 
            if(numbers[mid] > key) 
                end = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;

        System.out.println("index for key is : " + getBinarySearchIndex(numbers, key));
    }
}
