class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            // 1. Calculate the current area
            int width = r - l;
            int h = Math.min(heights[l], heights[r]);
            int currentArea = h * width;
            
            // 2. Update the maximum
            maxArea = Math.max(maxArea, currentArea);

            // 3. Move the pointer pointing to the shorter wall
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}