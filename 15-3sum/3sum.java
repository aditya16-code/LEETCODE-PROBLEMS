class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        for(int i=0;i<n;i++){
         Set<Integer>hashset=new HashSet<>();
         for(int j=i+1;j<n;j++){
            int target=-(nums[i]+nums[j]);
            if(hashset.contains(target)){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(target);
                Collections.sort(temp);
                set.add(temp);
            }
            hashset.add(nums[j]);
         }
        }
        List<List<Integer>>ans= new ArrayList<>(set);
        return ans;
    }
}