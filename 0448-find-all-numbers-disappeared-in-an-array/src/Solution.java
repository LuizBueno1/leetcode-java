import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        for(int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                list.add(i+1);
            }
        }

        return list;
    }
}