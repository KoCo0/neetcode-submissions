class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                isDuplicate = true;
            }
            set.add(nums[i]);
        }
        return isDuplicate;
    }
}