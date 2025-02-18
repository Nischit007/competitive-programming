


public class TwoDBinarySearch {
    

    public static boolean binarySearch(int arr[][] ,int target){
        if(arr.length==0 || arr==null || arr[0].length==0){
            return false;
        }
        int rows=arr.length;
        int cols=arr[0].length;
        int left=0;
        int right=rows*cols-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/cols;
            int col=mid%cols;
            int midvalue=arr[row][col];

            if(midvalue==target){
                return true;
            }else if(target>midvalue){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }



        return false;
    }



    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println(binarySearch(arr, target)); 
    }
}
