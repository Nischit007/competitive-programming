public class SearchInRotatedArray {
    public static int findInRotatedSortedArray(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[left] <= arr[mid]) {
                if (arr[left] <= key && arr[mid] > key) {
                    right = mid - 1;
                    return findInRotatedSortedArray(arr, left, right, key);

                } else {
                    left = mid + 1;
                    return findInRotatedSortedArray(arr, left, right, key);
                }
            } else {
                if (arr[mid] < key && key <= arr[right]) {
                    left = mid + 1;
                    return findInRotatedSortedArray(arr, left, right, key);
                } else {
                    right = mid - 1;
                    return findInRotatedSortedArray(arr, left, right, key);
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 11, 0, 1, 2 };
        int ans=findInRotatedSortedArray(arr, 0, arr.length - 1, 0);
        System.out.println(ans);
    }
}   
