
public class FindTheCeilingInAnArray {

    public static int binarySearch(int[] arr,int start,int end,int k){

        int celing = -1; 
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==k){
                return arr[mid];
            }else if(arr[mid]<k){
                
                start = mid + 1; 
            }else{
                celing = arr[mid];
                end=mid-1;
            }
        }
        return celing;
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,10,12,14};
        int target=0;
       int element= binarySearch(arr,0,arr.length-1,target);
        System.out.println(element);
    }
}
