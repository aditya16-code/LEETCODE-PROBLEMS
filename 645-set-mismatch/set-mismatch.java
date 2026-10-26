class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int rep=-1;int miss=-1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    count++;
                }
            }
            if(count==2){
                rep=i;
            }
            else if(count==0){
                miss=i;
            }
            if(rep!=-1&&miss!=-1){break;}
        }
        
        return new int[]{rep,miss};
    }
}