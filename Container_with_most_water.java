class Container_with_most_water {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer pointing to the shorter line
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}