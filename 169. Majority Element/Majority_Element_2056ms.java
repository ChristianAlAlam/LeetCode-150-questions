class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int k = 0, count;

        for(int i = 0; i<=n/2; i++){
            int t = nums[i];
            count = 0;
            for(int j = i+1; j<n; j++){
                if(nums[j] == t){
                    count++;
                }
            }

            if (count >= (n/2)){
                k = t;
            }
        }

        return k;
    }
}