class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currsum = 0;
        int minlength = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            currsum += nums[right];
            while(currsum >= target){
                if(right - left + 1 < minlength) {
                        minlength = right - left + 1;
                }
                currsum -= nums[left];
                left++;
            }
        }
        return minlength != Integer.MAX_VALUE ? minlength : 0;
    }
}