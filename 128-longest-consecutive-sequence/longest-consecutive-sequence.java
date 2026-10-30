class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int n=nums.length;
        int longest=1;
        HashSet<Integer>set=new HashSet<>();
        for(int num :nums){
            set.add(num);
        }
        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            int count=1;
            int el=num;
            while(set.contains(el+1)){
                count++;
                el++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}