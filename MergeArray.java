
public class MergeArray {

    public void merge() {
        System.out.println("inside the merge method");

        int[] num1 = new int[] { 9, 5, 1, 4, 2 };
        int[] num2 = new int[] { 2, 4, 6 };

        int l1 = num1.length;
        int l2 = num2.length;
        int l3 = l1 + l2;

        int[] num3 = new int[l3];

        for (int i = 0; i < l1; i++) {
            num3[i] = num1[i];
        }
        for (int i = 0; i < l2; i++) {

            num3[l1 + i] = num2[i];
        }
        System.out.println("Printing the merged array");

        for (int i = 0; i < l3; i++) {
            System.out.println(num3[i]);
        }

    }

    public static void main(String[] args) {

        MergeArray mergeArray = new MergeArray();
        mergeArray.merge();

    }
}
