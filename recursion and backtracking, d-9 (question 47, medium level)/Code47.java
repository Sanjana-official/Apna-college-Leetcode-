import java.util.ArrayList;
import java.util.List;

public class Code47 {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,List<Integer> current, List<List<Integer>> result) 
    {

        // base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) 
        {
            return;
        }
        // explore choices
        for (int i = index; i < candidates.length; i++) 
        {

            current.add(candidates[i]);

            // reuse same element → i (not i+1)
            backtrack(candidates, target - candidates[i], i, current, result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }
}
