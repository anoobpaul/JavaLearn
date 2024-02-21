/*******
 * Leet code # 26. Remove Duplicates from Sorted Array******************
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each
 * unique element appears only once. The relative order of the elements should
 * be kept the same. Then return the
 * number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 * Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * 
 */

public class RemoveDupfrmArray {
    public int removeDuplicates(int[] nums) {

        int k = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i < len - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[k] = nums[i];
                k++;
            }

        }

        return k;
    }

    public static void main(String[] args) {

        RemoveDupfrmArray rmA = new RemoveDupfrmArray();
        int nums[] = { 1, 1, 2 };
        int res = rmA.removeDuplicates(nums);
        System.out.println(res);

    }
}
