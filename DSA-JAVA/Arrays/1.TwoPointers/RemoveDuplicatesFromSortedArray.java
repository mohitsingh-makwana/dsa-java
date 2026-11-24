
/**
 * Problem: Two Sum
 * Platform: LeetCode #26
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: Easy
 *
 * Time: O(n)
 * Space: O(n)
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
         int left=0;
         for(int i=1;i<nums.length;i++){
            if(nums[left]!=nums[i]){
                nums[++left]=nums[i];
            }
         }
        return left+1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,3,3,7,11,11,15};
        int n = removeDuplicates(nums);
        for(int i=0;i<n;i++){
        System.out.println(nums[i]);
        }
    }
}