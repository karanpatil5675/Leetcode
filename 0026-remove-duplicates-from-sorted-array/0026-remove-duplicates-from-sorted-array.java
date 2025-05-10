public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        assert k == expectedNums.length : "Length mismatch";
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "Mismatch at index " + i;
        }

        System.out.println("All assertions passed. Number of unique elements (k) = " + k);
    }
}
