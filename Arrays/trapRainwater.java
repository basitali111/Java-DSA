// trap water in between buildings
class ArrayCC {
    public static int kadaneArray(int height[]) {
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappewater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappewater += waterLevel - height[i];
        }
        return trappewater;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 7, 4, 5};
        int trappedWater = kadaneArray(numbers);
        System.out.println("Trapped water: " + trappedWater);
    }
}