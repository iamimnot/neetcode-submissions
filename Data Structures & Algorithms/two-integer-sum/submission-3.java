class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> need_map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
           if(need_map.containsKey(nums[i])) return new int[]{need_map.get(nums[i]), i};

           need_map.put(target-nums[i], i);
        }

        return new int[]{};
    }

}