public class PrintSubArray {
    public static void printSubArray(int numbers[]) {
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;
    
        int total_subarrays = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];

                }
                if (sum > maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }
                total_subarrays++;
                System.out.println("sum: "+sum);
            }

            System.out.println();
        }
        System.out.println("Total Subarrays: " + total_subarrays);
        System.out.println("The maxsum of subarray : " + maxsum);
        System.out.println("The minsum of subarray: " + minsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArray(numbers);
    }
}