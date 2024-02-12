
class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m + n;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
            } else {
                nums1[index] = nums2[n];
                n--;
            }
            index--;
        }
        while (n > 0) {
            nums1[index] = nums2[n];
            n--;
            index--;

        }
    }

    public static void main(String[] args) {

        MergeArray mergeArray = new MergeArray();
        int[] nums1 = new int[] { 1, 2, 4, 2, 1 };
        int m = 5;
        int[] nums2 = new int[] { 5, 0, 3, 8, 9 };
        int n = 5;
        mergeArray.merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.println(num + "");
        }

    }
}