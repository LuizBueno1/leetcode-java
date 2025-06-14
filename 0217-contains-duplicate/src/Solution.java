import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

}
