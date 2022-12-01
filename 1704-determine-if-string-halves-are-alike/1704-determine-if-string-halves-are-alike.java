class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        int count = 0;
        
        for(char c : "aeiouAEIOU".toCharArray()){
            hs.add(c);
        }
        for(int i = 0; i< s.length()/2; i++){
            if (hs.contains(s.charAt(i))) count++;
		    if (hs.contains(s.charAt(i + s.length() / 2))) count--;
	    }

	return count == 0;
     
    }
}