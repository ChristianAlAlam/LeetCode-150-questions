class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int end = nums.length - 1;

        while (i <= end){
            if (nums[i] != val) {
                i++;
            }

            else {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }

        int k = end + 1;
        return k;
    }
}