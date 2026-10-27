import java.util.*;

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];

        q.offer(start);
        visited[start] = true;

        int dist = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int j = 0; j < size; j++) {
                int i = q.poll();

                if (nums[i] == target) {
                    return dist;
                }

                if (i - 1 >= 0 && !visited[i - 1]) {
                    q.offer(i - 1);
                    visited[i - 1] = true;
                }

                if (i + 1 < nums.length && !visited[i + 1]) {
                    q.offer(i + 1);
                    visited[i + 1] = true;
                }
            }

            dist++;
        }

        return -1;
    }
}