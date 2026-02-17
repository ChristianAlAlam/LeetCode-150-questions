class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];

        getPrefix(nums, prefix);
        getSufix(nums, sufix);
        
        for(int i = 0; i<nums.length; i++){
            answer[i] = prefix[i] * sufix[i];
        }

        return answer;
    }

    public void getPrefix(int[] nums, int[] prefix){
        prefix[0] = 1;

        for (int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
    }

    public void getSufix(int[] nums, int[] sufix){
        sufix[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--){
            sufix[i] = sufix[i+1] * nums[i+1];
        }
    }
}