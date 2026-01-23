class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int min;
        for(int i = 0; i<n; i++){
            nums1[m+i] = nums2[i];
        }

        for(int i = 0; i<m+n; i++){
            min = i;
            for(int j = i+1; j<m+n; j++){
                if(nums1[min] > nums1[j]){
                    min = j;
                }
            }
            int temp = nums1[i];
            nums1[i] = nums1[min];
            nums1[min] = temp;
        }
    }
}

// or simply

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int min;
//         for(int i = 0; i<n; i++){
//             nums1[m+i] = nums2[i];
//         }

//         Arrays.sort(nums1);
//     }
// }