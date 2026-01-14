class Solution {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1;
        int maxarea = 0;
        while(left < right){
                int currarea = Math.min(height[right],height[left]) *  (right - left) ;
                maxarea = Math.max(currarea,maxarea);
            if(height[right]> height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
