class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;

        boolean [][] isPal = new boolean[s.length()][s.length()];
        
        for(int i = 0; i < isPal.length; i++){
            isPal[i][i] = true;
        }
        
        int left = 0;
        int right = 0;
        
        
        for(int j = 0; j < s.length(); j++){
            for(int i = 0; i < j; i++){
                if(s.charAt(i) == s.charAt(j) && ((j - i <=1) || isPal[i+1][j-1])){
                    isPal[i][j] = true;
                    if(right - left < j - i){
                        left = i;
                        right = j;                       
                    }

                }
            }
        }
        
        return s.substring(left, right + 1);
        
    }   
}