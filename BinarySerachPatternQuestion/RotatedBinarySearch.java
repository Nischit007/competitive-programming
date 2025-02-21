public class RotatedBinarySearch {
    
    public static void main(String[] args) {
        int[] arr={10 , 9 , 8 ,7 , 1, 2, 3, 4, 5};
        int index=findThesSoultion(arr);
        System.out.println(index);
    }


    static int findThesSoultion(int[] arr){
        int pivot=findPivot(arr);
        int inFirstArray=binarySearch(arr,0,pivot,3);
        if(inFirstArray!=-1){
            return  inFirstArray;
        }
        if(pivot<arr.length-1){
            return binarySearch(arr,pivot+1,arr.length,3);
        }
        return -1;
    }
    
    static int findPivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            // 4 cases over here

            // 1st cases
            //  10 , 9 , 8 ,7 , 1, 2, 3, 4, 5  // suppose 7 is mid then the pivot is 7 beacause 7 > 1
            // also check to avoid index out of bound condition suppose 7 is at last the mid+1 is index out of bound ...
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
           
            // 2 nd cases
            //  10 , 9 , 8 ,7 , 1, 2, 3, 4, 5  // suppose 1 is mid then the pivot is 7 beacause 7 ie [mid-1] > 1 [mid]
            // also check for index out of bound
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            // 3 case 
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=start+1;
            }    
        }
        return -1;
    }



    public static int binarySearch(int[] arr,int start,int end ,int k){
        
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
}
