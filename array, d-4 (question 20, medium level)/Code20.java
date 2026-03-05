public class Code20{
    public static int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid; // duplicate is in left half
            } else {
                low = mid + 1; // duplicate is in right half
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,3};
        System.out.println(findDuplicate(nums));
    }
}