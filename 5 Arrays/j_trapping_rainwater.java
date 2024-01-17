public class j_trapping_rainwater {
    public static int trappedRainWater(int height[]) { // Time Complexity O(N)
        int n = height.length;
        // Calculate left max boundray
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundray
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(left max , right max)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
        ;
    }
}
