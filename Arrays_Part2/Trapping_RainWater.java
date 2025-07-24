package Arrays_Part2;

public class Trapping_RainWater {
    public static int Tripping_Water(int height[]) {
        // Calculate the leftMax boundary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate the rightMax boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int waterTrapped = 0;
        // loop
        for (int i = 0; i < height.length; i++) {
            // WaterLevel = min(lefMaxbound, rightMaxbound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // WaterTrapped = WaterLevel - height[i]
            waterTrapped += waterLevel - height[i];
        }
        return waterTrapped;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Therefor the water Trapped: " + Tripping_Water(height));
    }

}
