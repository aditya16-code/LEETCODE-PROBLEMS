class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0,sum=0;int dups=0;

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<k;i++){

            if(map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);
            }
            else{ map.put(nums[i],0);
}
           
            sum=sum+nums[i];

            if(map.get(nums[i])>=1){
                dups++;
            }
            
            
        }
        if(dups==0){
                max=Math.max(sum,max);
            }
        for(int i=k;i<nums.length;i++){
            int numtoadd=nums[i];
            int numtoremove=nums[i-k];
           if(map.containsKey(numtoadd)){
            map.put(numtoadd,map.get(numtoadd)+1);
           }
           else{map.put(numtoadd,0);}
           
        if(map.get(numtoadd)>=1){
            dups=dups+1;
        }
        sum=sum+nums[i];

      if(map.get(numtoremove)>=1){
        dups=dups-1;
      }
      map.put(numtoremove,map.get(numtoremove)-1);
       sum=sum-numtoremove;
       if(dups==0){
        max=Math.max(sum,max);
    }
        }
    
        
      
 return max;

    }
   
}