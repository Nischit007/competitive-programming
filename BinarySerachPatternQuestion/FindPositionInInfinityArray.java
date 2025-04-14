
// The above question was ask in amazon


// the length of array is infite means dont use .length function to find the length or last end 

public class FindPositionInInfinityArray {
//
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,10,13,17,19,20,22,50,51,100,101,102};
        System.out.println(ans(arr,13));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            // double the array
            end=end+(end-start+1)*2;
            start=temp;
        }

        int index=binarySearch(arr,start,end,target);
        return index;

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
        return 0;
    }

    
}
