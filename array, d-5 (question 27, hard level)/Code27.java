class Code27 {
    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge elements
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];

            }
        }

        // remaining of left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // remaining of right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (right <= high && (long)arr[i] > 2 * (long)arr[right])
                right++;
            count += right - (mid + 1);
        }

        return count;
    }

    public int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;

        if (low >= high)
            return cnt;

        int mid = (low + high) / 2;

        // Count inversions in left half
        cnt += mergeSort(arr, low, mid);

        // Count inversions in right half
        cnt += mergeSort(arr, mid + 1, high);

        // Count Pairs with A[i] > 2*A[j]
        cnt += countPairs(arr, low, mid, high);
        // recursive call
        merge(arr, low, mid, high);

        return cnt;
    }

    public int reversePairs(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}