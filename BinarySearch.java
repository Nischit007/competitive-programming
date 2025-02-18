public class BinarySearch {

    public static boolean  binarySearch(int[] arr,int k,int left,int right){
        if(left>right)return false;
        int mid=(left+right)/2;
        if(arr[mid]==k){
            return true;
        }else if(k>arr[mid]){
           return binarySearch(arr, k, mid+1, right);
        }else{
          return  binarySearch(arr, k, left, mid-1);
        }        
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,7,9,13,19};
        int k =2;
        System.out.println(binarySearch(arr,k,0,arr.length-1));
    }
}




