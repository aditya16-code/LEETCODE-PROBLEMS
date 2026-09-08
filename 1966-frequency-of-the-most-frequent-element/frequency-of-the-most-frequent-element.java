
// ------------------------------TLE---------------------------------------------------------
// class Solution {
//     public int maxFrequency(int[] nums, int k) {
//         int max=0;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum=sum+nums[j];
//                 int total=nums[j]*(j-i+1);
//                 if(total-sum>k){
//                     break;
//                 }
//                 max=Math.max(max,j-i+1);
//             }

//         }return max;
//     }
// }
// ------------------------------TLE---------------------------------------------------------

class Solution {
    public int maxFrequency(int[] nums, int k) {
       int max=0;
       long sum=0;
       Arrays.sort(nums) ;
       int i=0;
       int j=0;
       while(j<nums.length){
        sum=sum+nums[j];
        
        while((long)nums[j]*(j-i+1)-sum>k){
            sum=sum-nums[i];
            i++;
        }
        max=Math.max(max,j-i+1);
        j=j+1;
       }
       return max;
    }
}