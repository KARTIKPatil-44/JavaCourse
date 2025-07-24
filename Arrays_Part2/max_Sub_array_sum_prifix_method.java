package Arrays_Part2;

public class max_Sub_array_sum_prifix_method {
    public static void max_sub_array_sum_prifix(int arr[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prifix[] = new int[arr.length];

        // prifix array creation
        prifix[0] = arr[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }

        
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1]; // hear we have used turneary operator
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }
        System.out.println("maxsum: " + maxsum);

    }

    // O(n^2)
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        max_sub_array_sum_prifix(arr);
    }

}
