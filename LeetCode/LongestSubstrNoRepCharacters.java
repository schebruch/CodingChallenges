import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int priorCount = 0;
        
        Map<Character, Integer> charMap = new HashMap<>();
        
        if(s.length() == 0)
            return 0;
        
        
        for(int i = 0; i < s.length(); i++){
            if(charMap.containsKey(s.charAt(i))){
                i = charMap.get(s.charAt(i)) + 1;
                charMap.clear();
                count = Math.max(count, priorCount);
                priorCount = count;
                count = 0;
            }            
            charMap.put(s.charAt(i), i);
            count++;            
        }
        
        return Math.max(priorCount, count);
    }
}