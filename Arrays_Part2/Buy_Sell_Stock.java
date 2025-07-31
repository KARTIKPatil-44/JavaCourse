package Arrays_Part2;

public class Buy_Sell_Stock {

    // Function to calculate the maximum profit from buying and selling stock
    public static int BuySellStock(int prices[]) {
        // Initialize buyPrice to the maximum possible value so any first value is smaller
        int buyPrice = Integer.MAX_VALUE;

        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Loop through each price in the array
        for (int i = 0; i < prices.length; i++) {
            // If current price is greater than buyPrice, calculate profit
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Potential profit
                maxProfit = Math.max(maxProfit, profit); // Update maxProfit if this is higher
            } else {
                // If current price is smaller or equal, update buyPrice to this lower price
                buyPrice = prices[i];
            }
        }

        // Return the maximum profit that could be made
        return maxProfit;
    }

    public static void main(String[] args) {
        // Example stock prices
        int prices[] = {7, 1, 5, 3, 6, 4};

        // Print the result
        System.out.println("The maximum profit is: " + BuySellStock(prices));
    }

}
