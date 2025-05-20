package LeetChallenge;

/*
 * 
 * Question Link:- https://leetcode.com/contest/weekly-contest-318/problems/apply-operations-to-an-array/
 */
public class FirstChallenge{
    public static int[] applyOperations(int[] nums){
        int[] result = {};
        for(int i=0; i< nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                int temp = nums[i] *2;
                nums[i] = temp;
                nums[i+1] = 0;
            }
        }

        // move zeroes to end
        int count =0;
        for(int i=0; i< nums.length; i++){
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        
    }
}