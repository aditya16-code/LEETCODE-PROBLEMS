class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        long sn=(long)(n*(n+1))/2;
        long sn2=(long)n*(n+1)*(2*n+1)/6;
        long s=0;long s2=0;
        for(int i=0;i<n;i++){
            s+=(long)nums[i];
            s2+=(long)nums[i]*(long)nums[i];
        }
        long eq1=s-sn;
        long eq2=s2-sn2;
        eq2=eq2/eq1;
        long x=(eq1+eq2)/2;
        long y=x-eq1;
        return new int[]{(int)x,(int)y};
    }
}