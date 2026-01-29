class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length; 
       int k = 0;
       int count = 0;

       for (int i = 0; i<n; i++){
        if(count == 0){
            k = nums[i];
            count++;
            continue;
        }

        if(nums[i] == k) {
            count++;
        }

        else {
            count--;
        }

       }

       return k;
    }
}
