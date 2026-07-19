class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int freq = bucket.length - 1; freq >= 0 && index < k; freq--) {

            if (bucket[freq] != null) {

                for (int num : bucket[freq]) {
                    result[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return result;
    }
}