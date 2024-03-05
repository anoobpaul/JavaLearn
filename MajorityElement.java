public class MajorityElement {

    public int findMajourElement(int nums[]) {
        int count = 0;
        int element = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                element = nums[i];
                count++;
            }
            if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String args[]) {

        MajorityElement me = new MajorityElement();

        int nums[] = { 3, 2, 2 };
        int result = me.findMajourElement(nums);
        System.out.println("Result is " + result);

    }
}
