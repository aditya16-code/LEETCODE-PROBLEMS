class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>set =new HashSet<>();
        for(int i=0;i<Math.min(nums.length,k);i++){
        if(set.contains(nums[i])){
        return true;
        }
        set.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            set.remove(nums[i-k]);
        }
        return false;
    }
}
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             HashSet<Integer>set=new HashSet<>();
//             for(int j=i;j<=Math.min(i+k,nums.length-1);j++){
//                 if(set.contains(nums[j])){
//                     return true;
//                 }
//                 set.add(nums[j]);
//             }
//         }
//         return false;
//     }
// }