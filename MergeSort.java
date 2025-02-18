
// import java.util.ArrayList;

// public class MergeSort {

//     public static void conqurer(int[] arr,int low,int mid,int high){
//         ArrayList<Integer> list=new ArrayList<>();
//         int left=low;
//         int right=mid+1;

//         while(left<=mid && right<=high){
//             if(arr[left]<=arr[right]){
//                 list.add(arr[left++]);
//             }else{
//                 list.add(arr[right++]);
//             }
//         }


//         while(left<=mid){
//             list.add(arr[left++]);
//         }


//         while(right<=high){
//             list.add(arr[right++]);
//         }

//         for (int i = low; i <= high; i++) {
//             arr[i] = list.get(i - low);
//         }
//     }



//     public static void divide(int[] arr,int low,int high){
//         if(low>=high)return;

//         int mid=(low+high)/2;

//         divide(arr,low,mid);
//         divide(arr,mid+1,high);
//         conqurer(arr,low,mid,high);



//         }
    


 
//     public static void main(String[] args) {
//         int[] arr={5,8,1,2,10,4,3};
//         int n=arr.length-1;
//         divide(arr,0,n);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }








import java.util.ArrayList;

public class MergeSort {

    public static void conqueer(int[] arr,int low,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left++]);
            }else{
                list.add(arr[right++]);
            }
        }

        while(left<=mid){
            list.add(arr[left++]);
        }

        while(right<=high){
            list.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }

    }
    
    
    public static void divide(int[] arr,int low,int high){
        if(low>=high)return ;

        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        conqueer(arr,low,mid,high);
    }

 
    public static void main(String[] args) {
        int[] arr={5,8,1,2,10,4,3};
        int n=arr.length-1;
        divide(arr,0,n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



