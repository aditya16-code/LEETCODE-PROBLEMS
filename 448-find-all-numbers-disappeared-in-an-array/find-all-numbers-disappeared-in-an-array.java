class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List <Integer>res=new ArrayList<>();
        for(int j=1;j<=nums.length;j++){
            if(!set.contains(j)){
              res.add(j);
            }
        }
        return res;
    }
}