class Solution {
    public void moveZeroes(int[] nums) {
        // using snowball approach
        // int snowBallCnt = 0;
        // for(int i = 0; i<nums.length;i++){
        //     if(nums[i] == 0)
        //     {
        //         snowBallCnt++;
        //     }
        //     else{
        //         int t = nums[i];
        //         nums[i] =  0;
        //         nums[i-snowBallCnt] = t;
        //     }
        // }

        int insertIndex = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] !=0){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        
        while(insertIndex<nums.length){
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }
}