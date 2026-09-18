class Solution {
    public int missingNumber(int[] nums) {
     Set<Integer>set=new HashSet<>();
     for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
     }
     int j=0;
     for(int i=0;i<=nums.length;i++){
        if(!set.contains(i)){
            j=i;
        }
     }
     return j;
    }
}