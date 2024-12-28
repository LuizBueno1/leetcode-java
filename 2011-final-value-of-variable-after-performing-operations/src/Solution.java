public class Solution {
    
    public int finalValueAfterOperations(String[] operations){

        int len = operations.length;
        int value = 0;

        for(int i = 0; i < len; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                value++;
            } else{
                value--;
            }
        }

        return value;
    }
}
