import java.util.Arrays;
class Code125 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        m=nums1.length;
        n=nums2.length;
        for(int i=m-n ; i<m;i++)
        {
            nums1[i]=nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}