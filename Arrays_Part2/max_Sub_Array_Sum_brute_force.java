package Arrays_Part2;

class max_Sub_Array_Sum_brute_force {

    // Function to find the maximum subarray sum using brute force
    public static void maxSubArraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible value

        // Outer loop sets the starting index of the subarray
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            // Middle loop sets the ending index of the subarray
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = 0; // Reset currSum for each subarray

                // Inner loop calculates the sum of subarray from start to end
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }

                // Print the current subarray sum
                System.out.println("CurrSum: " + currSum);

                // Update maxSum if current sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print the maximum subarray sum found
        System.out.println("Max sum: " + maxSum);
    }

    // Time Complexity: O(n^3) — inefficient for large arrays
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};  // Example input
        maxSubArraySum(arr);           // Expected max sum: 8 (subarray: [6, -1, 3])
    }

}
