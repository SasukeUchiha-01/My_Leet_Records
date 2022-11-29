class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str == null || str.length == 0)
            return "";
        
        Arrays.sort(str);
        
        String first = str[0];
        String last = str[str.length - 1];
        
        int i = 0;
        
        while(i < first.length()){
            
            if (first.charAt(i) == last.charAt(i))
                i++;
            else break;
        }
        return i == 0 ? "" : first.substring(0,i); 
    }
}