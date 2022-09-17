import java.util.*;

class Leaders_Array{
    //Function to find the leaders in the array.
    public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(n);
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr1.get(i) > arr1.get(i+1)){
                arr2.add(i);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {16,17,4,3,5,2};
        arr1.add(leaders(arr, arr.length));
        System.out.println();
    }
}