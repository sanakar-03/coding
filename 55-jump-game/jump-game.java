class Solution {
    public boolean canJump(int[] nums) {
        int zeroDistance = 0; 
        boolean foundZero = false; 

        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]==0 && !foundZero)
                foundZero = true; 
            
            if(foundZero&&nums[i] <= zeroDistance)
                zeroDistance++; 

            else if(foundZero && nums[i] > zeroDistance){
                zeroDistance = 0; 
                foundZero = false; 
            }
        }

        return zeroDistance==0; 
    }
}