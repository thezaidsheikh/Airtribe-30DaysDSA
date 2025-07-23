import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean isDuplicate = false;
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num)) {
                isDuplicate = true;
                break;
            } else {
                map.put(num,i);
            }
        }

        return isDuplicate;
    }
}