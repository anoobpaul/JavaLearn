/*************************
 * * Leetcode #27* Remove Element ***********
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place.
 * The order of the elements may be changed. Then return the number of elements
 * in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * 
 * @leetcode #27 Remove Element
 * @author anoobpaul
 */

public class Removeelement {

    public int removeArrVal(int nums[], int val) {

        int k = 0;
        for (int i = 0; i <= nums.length - 1; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String args[]) {

        Removeelement rm = new Removeelement();

        int[] nums = { 3, 2, 3, 2 };
        int val = 3;
        int k = rm.removeArrVal(nums, val);
        System.err.println("K :" + k);

    }

}