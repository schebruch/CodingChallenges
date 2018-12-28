class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        
        int minLength = findMin(strs);
        
        for(int i = 0; i < strs.length-1; i++){
            if(!strs[i].substring(0,minLength).equals(strs[i+1].substring(0,minLength))){
                minLength--;
                if(minLength <= 0)
                    return "";
               i = -1;
            }
        }
        return strs[0].substring(0, minLength);
    }
    
    
    //O(n)
    public int findMin(String[] strs){
        int min = Integer.MAX_VALUE;
        for(String s : strs){
            if(s.length() < min)
                min = s.length();
        }
        return min;
    }
}