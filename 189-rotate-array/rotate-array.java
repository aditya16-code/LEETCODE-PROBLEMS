class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }
        //temp=[5,6,7]
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //nums=[1,2,3,1,2,3,4]
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}