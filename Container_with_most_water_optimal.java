class Container_with_most_water_optimal {
    public int maxArea(int[] height) {
        int max = 0;
        int h = 0;
        int start = 0;
        int end = height.length - 1;

        while(start < end){
            h = Math.min(height[start], height[end]);
            max = Math.max(max, h * (end - start));
            while(start < end && height[start] <= h) start++;
            while(start < end && height[end] <= h) end--;
        }

        return max;
    }
}