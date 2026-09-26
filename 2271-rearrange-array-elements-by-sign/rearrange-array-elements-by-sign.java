class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int j=0;
        int ans[]=new int[pos.size()+neg.size()];
        for(int i=0;i<pos.size();i++){
           ans[j]=pos.get(i);
           ans[j+1]=neg.get(i);
           j=j+2;
        }
        return ans;
        
    }
}