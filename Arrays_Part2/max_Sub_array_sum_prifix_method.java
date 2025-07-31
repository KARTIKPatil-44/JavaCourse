package Arrays_Part2;

public class max_Sub_array_sum_prifix_method {
    public static void max_sub_array_sum_prifix(int arr[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prifix[] = new int[arr.length];

        // prefix array creation
        // prefix[i] stores sum of elements from index 0 to i
        prifix[0] = arr[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }

        // Iterate over all possible subarrays using start and end indices
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                // Calculate current subarray sum using prefix array
                // If start is 0, take prefix[end], else subtract prefix[start - 1]
                currSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1]; // here we have used ternary operator

                // Update maxsum if current sum is greater
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }

        // Print the maximum subarray sum
        System.out.println("maxsum: " + maxsum);

    }

    // Time Complexity: O(n^2)
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        max_sub_array_sum_prifix(arr);
    }

}
