import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for(int i = 0; i < length; i++){
            Integer value = map.get(nums[i]);
            if(value != null){
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
