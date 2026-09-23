class Solution {
    public int majorityElement(int[] nums) {
        //hashing
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;int ans=0;
        for(Map.Entry<Integer,Integer>entry :map.entrySet()){
         if(entry.getValue()>max){
          max=entry.getValue();
          ans=entry.getKey();
         }
         
        }
          
          return ans;
    }
    
}