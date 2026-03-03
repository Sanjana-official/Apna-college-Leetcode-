import java.util.*;
public class Code18 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
       int prefixMul[]=new int[nums.length];
       for(int i=1;i<nums.length;i++)
       {
            prefixMul[i] = prefixMul[i-1]*nums[i];
       }
       System.out.println(Arrays.toString(prefixMul));
    
    }
}
