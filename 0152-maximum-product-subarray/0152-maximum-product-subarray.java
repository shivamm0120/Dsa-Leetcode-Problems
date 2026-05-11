class Solution {
    public int maxProduct(int[] nums) {
        int minPro=nums[0],maxPro=nums[0],res=nums[0];

        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2= minPro*nums[i];
            int v3= maxPro*nums[i];

            minPro=Math.min(v1,Math.min(v3,v2));
            maxPro=Math.max(v1,Math.max(v2,v3));

            res=Math.max(res,maxPro);
        }
        return res;
        
    }
}