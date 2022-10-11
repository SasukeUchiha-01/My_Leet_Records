// Hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            hm.putIfAbsent(nums[i], i);
        }
            for(int i = 0; i < nums.length; i++){
                
                int dif = target - nums[i];
                if(hm.containsKey(dif) && hm.get(dif) != i){
                    return new int[] {i, hm.get(dif)};
                }
            }
        return new int[] {-1, -1};
    }
}
