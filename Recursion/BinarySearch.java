


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,8,9,10};
       System.out.println(BinarySearch(arr,0,arr.length-1,9));
    }
    static int BinarySearch(int[] arr,int start,int end,int k){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                // end=mid-1;
               return  BinarySearch(arr, start, mid-1, k);
            }else{
                // start=mid+1;
               return BinarySearch(arr, mid+1, end, k);
            }
        }
        return -1;
    }
}
