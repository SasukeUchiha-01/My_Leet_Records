class Solution {
    public int[] singleNumber(int[] nums) {
       int[] ans = {0,0};
        
        int x = 0;
        for(int num : nums ){
            x ^= num;
        }
        x &= -x;
        
        for(int num : nums){
            if((x & num) == 0) 
                ans[0] ^= num; 
            else ans[1] ^= num;
        }
        return ans;
    }
}



