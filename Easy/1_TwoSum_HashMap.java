class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        Map<Integer, Integer> myMap = new HashMap<Integer,Integer>();
        for(int i=0; i< nums.length ; i++ ) {
            int complement = target-nums[i];
            if(myMap.containsKey(complement)){
                return new int[] {myMap.get(complement), i};
            }
            myMap.put(nums[i], i);


        }
         return new int[] {};
    }
}
