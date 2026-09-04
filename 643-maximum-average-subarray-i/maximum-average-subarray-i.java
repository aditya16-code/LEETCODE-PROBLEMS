class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=Double.MIN_VALUE;
        double avg=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
            // avg=sum/k;
        }
        
        max=sum;
        for(int i=k;i<nums.length;i=i+1){
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            // avg=sum/k;
            max=Math.max(sum,max);
        }
        
        
        return max/k;
    }
   
}