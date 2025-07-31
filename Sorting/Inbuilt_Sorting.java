package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Inbuilt_Sorting {
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {5,3,1,4,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,2); from 0 index ot 1 so inclusive so 0 to 2 idx
        // Arrays.sort(arr,Collections.reverseOrder()); // sort in reverse order
        // Arrays.sort(arr,0,2,Collections.reverseOrder()); sort in reverse order from  0 index ot 1 so inclusive so 0 to 2 idx
        printArr(arr);
    }
    
}