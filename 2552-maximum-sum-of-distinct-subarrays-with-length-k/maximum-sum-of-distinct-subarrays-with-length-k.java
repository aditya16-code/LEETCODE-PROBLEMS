

// ------------------------------------------TLEEE----------------------------------------------
// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         // Set<Integer>set=new HashSet<>();
//         long max=0;
//         // boolean dup=false;
//         for(int i=0;i<=nums.length-k;i++){
//             long sum=0;
//             boolean dup=false;
//         Set<Integer>set=new HashSet<>();
//             for(int j=i;j<=i+k-1;j++){
//                if(set.contains(nums[j])){
//                 dup=true;
//                 break;
//                }
//                set.add(nums[j]);
//                sum=sum+nums[j];
//             //    max=Math.max(sum,max);
//             }
//             if(!dup){
//                 max=Math.max(sum,max);
//             }

//         }
//         return max;
//     }
// }
//--------------------------------------------------------------------------------------------
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}