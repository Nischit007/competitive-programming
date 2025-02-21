

class FindTheTargetInRotatedArray {

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        FindTheTargetInRotatedArray array=new FindTheTargetInRotatedArray();
        int index=array.search(arr,0);
        System.out.println(index);
    }

    public int search(int[] arr, int target) {
        int peak=findPeakIndex(arr);
        int inStartIndex=binarySearch(arr,0,peak-1,target);
        if(inStartIndex!=-1){
            return inStartIndex;
        }
        System.out.println(peak);
        if(peak==arr.length-1){
            return -1;
        }
        return binarySearch(arr,peak,arr.length-1,target);
    }

    public int findPeakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start < end) {
            int mid = (start + end) / 2;
            
            
            if (arr[mid] < arr[end]) {
                   end = mid;
              
            } else {
                start = mid + 1;
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
}
