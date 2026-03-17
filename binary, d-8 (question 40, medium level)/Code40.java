public class Code40 {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length;
        int mid = ( start + end ) /2;
        while(mid > start && mid < end)
        {
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid-1])
            {
                mid = mid-1;
            }
            else 
            {
                mid = mid+1;
            }
        }
        return mid;
    }
}
