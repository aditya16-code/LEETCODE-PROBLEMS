
class Solution {
    int count=0;
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        mergeSort1(nums, low, high);
        return nums;
    }

    public void mergeSort1(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort1(nums, low, mid);
        mergeSort1(nums, mid + 1, high);
        CountPairs(nums,low,mid,high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[low + i] = temp.get(i);
        }
    }

public void CountPairs(int nums[],int low,int mid,int high){
    int n=nums.length;
    int right=mid+1;
    for(int i=low;i<=mid;i++){
        while(right<=high&&(long)nums[i]>(2L*nums[right])){
            right++;}
            count=count+(right-(mid+1));}
        
    
}
    public int reversePairs(int[] nums) {
         mergeSort1(nums,0,nums.length-1);
         return count;
    }
}
    
