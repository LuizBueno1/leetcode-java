import java.util.Arrays;
import java.util.HashMap;


public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int length = nums.length;
        int[] answer = new int[length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < length; i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], i);
            }
        }

        for(int i = 0; i < length; i++){
            answer[i] = map.get(nums[i]);
        }

        return answer;
    }
}
