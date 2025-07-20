class Solution {
    int index1 = 0;
    int index2;
    boolean isMatched = false;

    public int[] twoSum(int[] nums, int target) {
        int secondIndex = index1 + 1;
        int firstVal = nums[index1];

        if (secondIndex <= nums.length) {
            for (int index = secondIndex; index < nums.length; index++) {
                int sum = firstVal + nums[index];
                if (sum == target) {
                    isMatched = true;
                    index2 = index;
                }
            }
        }
        if (!isMatched) {
            index1++;
            twoSum(nums, target);
        }
        int[] result = { index1, index2 };
        return result;

    }
}