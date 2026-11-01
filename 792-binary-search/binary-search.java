class Solution {
    public int search(int[] nums, int target) {
        return recursion(nums,0,nums.length-1,target);
        
    }
    public int recursion(int nums[],int low,int high,int target){
        int mid=(low+high)/2;
        if(low>high)return -1;
           if(nums[mid]==target){
            return mid;
           }
           else if(target>nums[mid]){
            return recursion(nums,mid+1,high,target);
           }
           else{
            return recursion(nums,low,mid-1,target);
           }
        
        
    }
}

