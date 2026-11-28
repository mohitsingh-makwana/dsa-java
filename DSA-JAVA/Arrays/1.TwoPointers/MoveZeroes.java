
/**
 * Problem: Move Zeroes
 * Platform: LeetCode #283
 * Link: https://leetcode.com/problems/move-zeroes/
 * Difficulty: Easy
 *
 * Time: O(n)
 * Space: O(1)
 */


class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)nums[k++]=nums[i];
        }
        while(k<nums.length){
            nums[k++]=0;
        }
        
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,3,3,7,11,11,15};
        int n = nums.length;
        moveZeroes(nums);

        for(int i=0;i<n;i++){
        System.out.println(nums[i]);
        }
    }
}