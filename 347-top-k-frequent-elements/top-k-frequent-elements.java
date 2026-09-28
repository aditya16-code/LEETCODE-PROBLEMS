class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // 2. Create buckets
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        // 3. Put numbers into bucket according to frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(number);
        }

        // 4. Pick from highest frequency bucket
        int[] ans = new int[k];
        int index = 0;

        for (int frequency = bucket.length - 1;
             frequency >= 0 && index < k;
             frequency--) {

            if (bucket[frequency] != null) {

                for (int number : bucket[frequency]) {

                    ans[index] = number;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}