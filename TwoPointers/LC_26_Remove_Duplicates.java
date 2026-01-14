/*
LeetCode 26: Remove Duplicates from Sorted Array
Pattern: Two Pointers
Time: O(n)
Space: O(1)
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int j=1;
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
