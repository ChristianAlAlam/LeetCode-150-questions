class Solution {
    public int jump(int[] nums) {
        int farest = 0, jumps = 0, current = 0;

        for (int i = 0; i < nums.length-1; i++) {
            farest = Math.max(farest, i + nums[i]);

            if (current == i){
                jumps++;
                current = farest;
            }
        }

        return jumps;
    }
}