package Arrays_Part2;

public class Max_prod_subarray {

    public static int maxprodsubarray(int arr[]) {
        // Approch 1 brute force
        // int ans = Integer.MIN_VALUE;
        int n = arr.length;
        // for(int i=0; i<n; i++){
        // int pord = 1;
        // for(int j=i; j<n; j++){
        // pord = pord*arr[j];
        // ans = Math.max(pord,ans);
        // }
        // }
        // return ans;

        // Approch 2 using Kadan's algorithm
        // Initialize max , min and answer product at the first element
        int max = arr[0];
        int min = arr[0];
        int answer = arr[0];

        for (int i = 1; i < n; i++) {
            // If the current element is negative, swap max and min
            // because multiplying with a negative reverses max ↔ min
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Update max product ending at current index
            // Either take the current element or extend the previous max product
            max = Math.max(max * arr[i], arr[i]);

            // Similarly update min product ending at current index
            min = Math.min(min * arr[i], arr[i]);

            // Update the final answer with the current max
            answer = Math.max(answer, max);
        }

        return answer;

    }

    public static void main(String[] args) {
        int arr[] = { -1, -10, -5, 2 };
        System.out.println(maxprodsubarray(arr));
    }

}
