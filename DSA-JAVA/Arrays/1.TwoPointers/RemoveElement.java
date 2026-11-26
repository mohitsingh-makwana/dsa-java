/**
 * Problem: Two Sum
 * Platform: LeetCode #27
 * Link: https://leetcode.com/problems/remove-element/
 * Difficulty: Easy
 *
 * Time: O(n)
 * Space: O(n)
 */

class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[left++]=nums[i];
            }
        }
        return left;
    }
     public static void main(String[] args) {
        int[] nums=new int[]{2,3,7,11,15};
        int target=11;
        int n = removeElement(nums,target);

        for(int i=0;i<n;i++){
        System.out.println(nums[i]);
        }
    }
}