class Solution {
    public boolean isPalindrome(int x) {
        int rem, num;
        long rev = 0;
        num = x;
        
        while(x!=0 && x > 0){
            rem = x%10;
            rev = rev *10+rem;
            x /= 10;
        }
        
        if(num == rev){
            return true;
        }
        else return false;
    }
}