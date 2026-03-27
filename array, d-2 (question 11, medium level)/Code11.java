import java.util.*;
public class Code11 {
    public List<List<Integer>> twoSum(int[] nums, long target, int st){
     int n = nums.length;
     List<List<Integer>> res = new ArrayList<>();
     int l = st; // start
     int r = n-1; // end 
     while(l<r){
         long sum = nums[l]+nums[r]; // c + d

         if(sum==target){

             List<Integer> ans = new ArrayList<>();
             ans.add(nums[l]); // add c
             ans.add(nums[r]); // add d
             res.add(ans);

             l++;
             r--;

             while(l<r && nums[l]==nums[l-1]) l++; // skip duplicates for c
             while(l<r && nums[r]==nums[r+1]) r--; // skip duplicates for d
         }
         else if(sum<target) l++;
         else r--;
     }
     return res;
 }
 public List<List<Integer>> fourSum(int[] nums, int target) {
     List<List<Integer>> res = new ArrayList<>();
     int n = nums.length;
     Arrays.sort(nums);

     // fix a and b and get other number c and d using twoSum
     for(int i=0; i<n; i++){
         if(i>0 && nums[i]==nums[i-1]) continue; // skip duplicates for a
         int a = nums[i]; // fix a

         for(int j=i+1; j<n; j++){
             if(j>i+1 && nums[j]==nums[j-1]) continue; // skip duplicates for b
             int b = nums[j]; // fix b

             long rem = target-((long)a+b); // remaining sum
             List<List<Integer>> others = twoSum(nums, rem, j+1); // get all pairs whose sum = rem
             for(int k=0; k<others.size(); k++){
                 List<Integer> ans = others.get(k);
                 ans.add(a); // add a to that pair
                 ans.add(b); // add b to that pair
                 res.add(ans); // now add curr ans to res
             }
         }
     }
     return res;
 }
}