import java.util.Arrays;

public class Solution {
    public boolean isPalindrome(int x){
        String number = Integer.toString(x);
        char[] numberArray = number.toCharArray();
        int pointerA = 0;
        int pointerB = numberArray.length-1;

        while (pointerA <= pointerB){
            if(numberArray[pointerA] != numberArray[pointerB]){
                return false;
            }
            pointerA++;
            pointerB--;
        }
        return true;
    }


}
