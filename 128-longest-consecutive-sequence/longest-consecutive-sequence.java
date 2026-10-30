class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int longest=1;
        int n=nums.length;
        int currCount=0;
        int lastsmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
         if(nums[i]-1==lastsmaller){
            currCount++;
            lastsmaller=nums[i];
         }
         else if(nums[i]!=lastsmaller){
            currCount=1;
            lastsmaller=nums[i];
         }
         longest=Math.max(longest,currCount);
        }
        return longest;
    }
    
}