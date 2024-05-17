class Solution {
    public boolean canJump(int[] nums) {
        int count = nums.length-1;
        for(int i = nums.length-2; i >= 0; i--){
            if(i + nums[i] >= count){
                count = i;
            }

        }
        return count == 0;
    }  
}
