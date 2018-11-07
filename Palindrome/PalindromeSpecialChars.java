public class PalindromeSpecialChars{


    public static boolean isPalindrome(String s){
        if(s.length() <= 1)
            return true;
        int low = 0;
        int high = s.length() -1;
        
        while(low < high){
            while(!Character.isLetterOrDigit(s.charAt(low)) && low < high){
                low++;
            }
            while(!Character.isLetterOrDigit(s.charAt(high)) && low < high){
                high--;
            }
            if(low > high) 
                return false;
            char lowChar = Character.toLowerCase(s.charAt(low));
            char highChar = Character.toLowerCase(s.charAt(high));
            if(lowChar != highChar){
                return false; 
            }
            low++;
            high--;
        }

        return true;
    }

}
