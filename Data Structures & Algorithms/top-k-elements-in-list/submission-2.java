class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initialise a hashmap and list to count the frequencies
        Map<Integer, Integer> count = new HashMap<>();
        // Populate the array list
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0; i < nums.length + 1; i++){
            freq[i] = new ArrayList<>();
        }
        // Count the frequencies
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        // Add the datas into a map
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        // Initialise the result array and traverse the index
        int[] res = new int[k];
        int index = 0;
        // Populate the results into the array
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                res[index++] = n;
                // Return when the index is k
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
