
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);

                if (distance < ans) {
                    ans = distance;
                }
            }
        }

        return ans;
    }
}