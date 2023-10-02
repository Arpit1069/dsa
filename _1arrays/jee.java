package _1arrays;

public class jee {
    public static void main(String[] args) {
        int[] num = { 11, 13, 15, 17 };
        Solution s = new Solution();
        s.findMin(num);
    }
}

class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[r] > nums[mid]) {
                r = mid - 1;
            } else if (nums[r] > nums[mid]) {
                l = mid + 1;
            }
        }
        return -1;
    }

}