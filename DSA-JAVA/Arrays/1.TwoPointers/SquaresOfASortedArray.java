
/**
 * Problem: Squares of a Sorted Array
 * Platform: LeetCode #977
 * Link: https://leetcode.com/problems/squares-of-a-sorted-array/
 * Difficulty: Easy
 *
 * Time: O(n)
 * Space: O(n)
 */
public class SquaresOfASortedArray {

    public static int[] squaresOfASortedArray(int[] nums) {
        int ans[]=new int[nums.length];
        int l=0;
        int r=ans.length-1;
        for(int i=ans.length-1;i>=0;i--){
            int n1=nums[l]*nums[l];
            int n2=nums[r]*nums[r];
            if(n1<n2){
                ans[i]=n2;
                r--;
            }
            else {
                nums[i]=n1;
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,3,3,7,11,11,15};
        int n=nums.length;

        int ans[]=squaresOfASortedArray(nums);
        
        for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
        }
    }
}