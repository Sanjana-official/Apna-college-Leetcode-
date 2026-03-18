public class Code46{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(mergedArray);
        if(mergedArray.length==1)
        {
            return (double)mergedArray[0];
        }
        int mid=mergedArray.length/2;
        if(mergedArray.length%2==0)
        {
            return (mergedArray[mid]+mergedArray[mid-1])/2.0;
        }
        else
        {
            return (double)mergedArray[mid];
        }
    }
}