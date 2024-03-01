
// 80. Remove Duplicates from Sorted Array II
public class RemDupesFrmSortedArray2 {

    public int removeDuplicates2(int nums[]) {

        int k = 0;

        for (int n : nums) {
            if (k < 2 || n != nums[k - 2]) {
                nums[k++] = n;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        RemDupesFrmSortedArray2 rmA2 = new RemDupesFrmSortedArray2();
        int nums[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int res = rmA2.removeDuplicates2(nums);
        System.out.println(res);

    }

}
