
public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n - 1;
        int p = m - 1;
        int q = n - 1;

        while (p >= 0 && q >= 0) {
            if (nums1[p] > nums2[q]) {
                nums1[length] = nums1[p];
                p--;
            } else {
                nums1[length] = nums2[q];
                q--;
            }
            length--;
        }
        while (q >= 0) {
            nums1[length] = nums2[q];
            q--;
            length--;
        }

    }

    public static void main(String[] args) {
        MergeArray mergeArr = new MergeArray();
        int[] nums1 = { 1, 2, 3, 0, 0 };
        int m = 3;
        int[] nums2 = { 5, 0, 3, 8, 9 };
        int n = 3;
        mergeArr.merge(nums1, m, nums2, n);

    }
}
