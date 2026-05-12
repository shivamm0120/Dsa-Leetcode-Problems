class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0],ans=nums[0];
        

        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(nums[i],maxSum+nums[i]);

            ans=Math.max(ans,maxSum);

        }
        return ans;
        
    }
}