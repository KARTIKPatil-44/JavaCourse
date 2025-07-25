package Arrays_Part2;

public class max_Sub_array_sum_KadansAlgorithm {
    public static void maxSumArray(int arr[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           currSum+= arr[i];
           if(currSum < 0){
            currSum = 0;
           }
           maxsum = Math.max(currSum,maxsum);
        }
      System.out.println("The maxsubArray: "+maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSumArray(arr);
    }

}
