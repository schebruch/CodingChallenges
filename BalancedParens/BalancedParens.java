/**
 * Question: Given a String of only parentheses, determine if they're
 * "balanced": for each opening paren, there is a closing paren corresponding
 * to it.
 */
public class BalancedParens{

    //Iterative O(n) solution, O(1) space
    public static boolean balancedIteratively(String parens){
        //initiaze left paren counter and right paren counter
        int leftCounter = 0;
        int rightCounter = 0;

        //for each character, if it's a left paren,
        //increment leftCounter. Else increment rightCounter
        //If at any point rightCounter > leftCounter, we 
        //know it's not balanced
        for(int i = 0; i < parens.length(); i++){
            if(parens.charAt(i) == ')')
                rightCounter++;
            else
                leftCounter++;
            
            if(rightCounter > leftCounter)
                return false;
        }
        //we must check if the left and right counter equal, as there could be 
        //more left parens than right parens at the end of the loop
        if(rightCounter == leftCounter)
            return true;
        
        return false;
    }

    public static void main(String[] args){
        System.out.println(balancedIteratively("(())")); //should print true
        System.out.println(balancedIteratively(")()")); //should print false
        System.out.println(balancedIteratively("(()")); //should print false
        System.out.println(balancedIteratively("(()(()))")); //should print true
    }

}