class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int rep=-1;
        int miss=-1;
        int hasharr[]=new int[n+1];
        for(int i=0;i<n;i++){
            hasharr[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
           if(hasharr[i]==2){ rep=i;}
           else if(hasharr[i]==0){miss=i;}
           if(miss!=-1&&rep!=-1){break;}
        }
        return new int[]{ rep,miss};
    }
}