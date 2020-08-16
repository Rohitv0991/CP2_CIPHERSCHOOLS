class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while(j < nums.length) {
            if(i == j) {
                j++;
                continue;
            }
            if(nums[i] == 0) {
                if(nums[j] !=0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
                else j++;
            }
            if(nums[i] != 0) i++;
        }
    }
}
