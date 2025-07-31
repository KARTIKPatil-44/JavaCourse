package Arrays_Part2;

public class max_Sub_array_sum_KadansAlgorithm {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static void maxSumArray(int arr[]) {
        int currSum = 0;                         // Current running sum of subarray
        int maxsum = Integer.MIN_VALUE;          // Holds the maximum subarray sum found so far

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];                   // Add current element to running sum

            // If current sum becomes negative, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }

            // Update maxsum if current sum is greater
            maxsum = Math.max(currSum, maxsum);
        }

        // Print the final maximum subarray sum
        System.out.println("The max subarray sum: " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };  // Example input
        maxSumArray(arr);                            // Expected output: 7 (subarray: [4, -1, -2, 1, 5])
    }

}
