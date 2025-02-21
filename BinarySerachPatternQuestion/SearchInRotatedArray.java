
public class SearchInRotatedArray {    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,0,1,2,3};
        int index= FindTheIndexInMountainArray(arr,0);
        System.out.println(index);
    }
    public static int FindTheIndexInMountainArray(int[] arr,int target){

        int peak=PeakElement(arr);
   
        int inFirstArray=binarySearch(arr, 0, peak, target);
        if(inFirstArray!=-1){
            return inFirstArray;
        }
        return binarySearch(arr, peak+1, arr.length-1, target);
    }

    public static int PeakElement(int [] arr){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }



    public static int binarySearch(int[] arr,int start,int end,int k){
       
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                start = mid + 1;       
            }else{
                end=mid-1;
            }
        }

        return -1;
    }



    // public static int binarySearchdes(int[] arr,int start,int end,int k){
       
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(arr[mid]==k){
    //             return mid;
    //         }else if(arr[mid]<k){
    //             end=mid-1;
    //         }else{
    //             start = mid + 1; 
                
    //         }
    //     }

    //     return -1;
    // }
}       
