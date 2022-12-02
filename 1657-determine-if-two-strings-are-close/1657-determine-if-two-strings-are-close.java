class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        
        Map<Character, Integer> hm1 = new HashMap();
        Map<Character, Integer> hm2 = new HashMap();
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        
        for(int i = 0; i < word1.length(); i++){
            hm1.put(word1.charAt(i), 1 + hm1.getOrDefault(word1.charAt(i), 0));
        }
        
        for(int i = 0; i < word1.length(); i++){
            if(hm1.containsKey(word2.charAt(i))){
                hm2.put(word2.charAt(i), 1 + hm2.getOrDefault(word2.charAt(i), 0));
            }else return false;
        }
        
        for(Map.Entry<Character, Integer> m : hm1.entrySet()) {a.add(m.getValue()); }
        for(Map.Entry<Character, Integer> m : hm2.entrySet()) {b.add(m.getValue()); }
        
        Collections.sort(a);
        Collections.sort(b);
        
        return a.equals(b);
    }
}