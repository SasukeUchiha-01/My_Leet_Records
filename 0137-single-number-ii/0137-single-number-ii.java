class Solution {
    public int singleNumber(int[] nums) {
        int occur1 = 0, occur2 = 0, occur3 = 0;
        
        for(int i = 0; i < nums.length; i++){
            
// twos holds the num that appears twice
            occur2 |= nums[i] & occur1;
// ones holds the num that appears once
            occur1 ^= nums[i];
            
// threes holds the num that appears three times
            occur3 = occur1 & occur2;
            
// if num[i] appears three times doing this will clear ones and twos
            occur1 &= ~occur3;
            occur2 &= ~occur3;
        }
        return occur1;
    }
}
