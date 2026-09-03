class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;int i=0;
        int size=Integer.MAX_VALUE;
        int j=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                size=Math.min(size,j-i+1);
                sum=sum-nums[i];
                i=i+1;
                
            }
            
            j=j+1;
        }
        return size==Integer.MAX_VALUE?0:size;
    }
}
// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int sum=0;
//         // int size=0;
//         int size=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum=sum+nums[j];
//                 if(sum>=target){
//                     size=Math.min(size,j-i+1);
//                     break;
//                 }
//             }
//         }
//         return size==Integer.MAX_VALUE?0:size;
//     }
// }
