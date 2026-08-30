class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
       do{
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast)
            break;
        } while(fast!=slow);
        int n1=0;
        int n2=slow;
        while(n1!=n2){
            n1=nums[n1];
            n2=nums[n2];
        }
        return n2;
    }
}// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashSet<Integer>set=new HashSet<>();
//         int i=0;
//         while(i<nums.length){
//             if(set.contains(nums[i])){
//                 return nums[i];
//             }
//             else
//             set.add(nums[i]);
//             i++;

//         }
//         return -1;
//     }
// }
//------------------------------TLE------------------------------------------------------
// class Solution {
//     public int findDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                 return nums[i];
//             }
//             }
            
//         }
//         return -1;
//     }
// }
//
//--------------------------------TLE----------------------------------------------------