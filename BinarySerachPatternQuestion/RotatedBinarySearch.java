public class RotatedBinarySearch {
    
    public static void main(String[] args) {
        int[] arr={10 , 9 , 8 ,7 , 1, 2, 3, 4, 5};
        int index=search(arr,13);
        System.out.println(index);
    }


    static int search(int[] arr,int target){
        int pivot=findPivot(arr);
        if(pivot==-1){
           return binarySearch(arr,0,arr.length-1,target);
        }
        if(arr[pivot]==target){
            return pivot;
        }

        if(target>=arr[0]){
          return  binarySearch(arr,0,pivot-1,target);
        }

        return  binarySearch(arr,pivot+1,arr.length-1,target);
        
    }
    // this will not work in duplicate values
    // example 2,9,2,2,2 where before rotation the array was 2,2,2,2,9 ->rorated 2 time from right

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

    static int findPivotWithDuplicate(int[] arr){
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
//
            // 3 case 
            
            // if elements at middle,start,end are equals the just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip the duplicates
                // Note :what if the these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // check end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted ,so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
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
