package Arrays_Part2;

import java.util.Arrays;
import java.util.HashMap;

public class Contains_Duplicate {
    public static boolean containsDupllicate(int arr[]){

        // APPROCH 1  wITH TC = o(N^2)
        int n= arr.length;
        // for(int i=0; i<=n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] == arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // APPROCH 2 WITH TC = o(NlogN)
        // Arrays.sort(arr);
        // for(int i=0; i<n-1; i++){
        //     if(arr[i] ==arr[i+1]){
        //         return true;
        //     }
        // }
        // return false;

         // APPROCH 3 WITH TC = o(N) uisng HashMap
         HashMap<Integer,Integer>map = new HashMap<>();
         for(int i=0;i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>1){
                return true;
            }
         }
         return false;

    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,1};
        System.out.println(containsDupllicate(arr));
    }
    
}
