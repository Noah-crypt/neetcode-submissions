
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>(); //Create a hashmap
        for(int i = 0; i < nums.length; i++){  
            int num = nums[i];
            int diff = target - num;  //Initialise the parametres

            if(prevMap.containsKey(diff)){ //Get the 2nd number and return it
                return new int[]{
                    prevMap.get(diff), i
                };
            }
            prevMap.put(num, i);  //Add new numbers into the map
        }
        return new int []{};
    }
}
