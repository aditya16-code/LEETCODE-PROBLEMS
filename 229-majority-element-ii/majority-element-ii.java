class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        int minel=(n/3)+1;
        for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])==minel){
            ans.add(nums[i]);
        }
        if(ans.size()==2){ break;}
        }
        return ans;
       
    }
}