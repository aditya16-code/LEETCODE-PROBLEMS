class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int b=nums.length-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;b--;
        }
         int elementcount=1; 
        for(int i=1;i<nums.length;i++){
           
            if(nums[i]!=nums[i-1]){
               elementcount++;
            }
        
        if(elementcount==3){
                return nums[i];
            }
            }
            return nums[0];

    }
}