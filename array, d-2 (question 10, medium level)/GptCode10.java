//i didnt know yet how to work with public List<List<Integer>> threeSum(int[] nums) type of function so
//i asked gpt to change my code which returns value suitable for this tye of return function.
//that did work a bit, but in the question, the elements can be in whatever order, which did not align
//with my code so i straight asked for solution of the question and submitted it.it was accepted.
//will visit this question later when i know how list and all work.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GptCode10 {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    
    Arrays.sort(nums); // Step 1: Sort the array

    for (int i = 0; i < nums.length - 2; i++) {

        // Skip duplicate values for i
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Skip duplicates for left
                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }

                // Skip duplicates for right
                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }

                left++;
                right--;
            } 
            else if (sum < 0) {
                left++;
            } 
            else {
                right--;
            }
        }
    }

    return result;
    }
}
