
public class FindTheCeilingInAnArray {

    public static int binarySearch(int[] arr,int start,int end,int k){

        while(start<end){
            int mid=(start+end)/2;

            if(arr[mid]==k){
                return arr[mid];
            }else if(arr[mid]<k){
                binarySearch(arr, mid+1, end, k);
            }else{
                binarySearch(arr, start, mid-1, k);
            }
        }
        return arr[start+1];
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,10,12,14};
        int target=8;
       int element= binarySearch(arr,0,arr.length-1,target);
        System.out.println(element);
    }
}
