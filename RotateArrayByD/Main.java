// leetcode Qno : 189

// I have solve this question in two methods

                                            // method 1 
class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int tempK = k;

        int[] a = new int[arr.length];
        int rotate = n - k;
        int i = 0;
        while (k < n) {
            a[k]=arr[i];
            i++;
            k++;
        }
        
        k = tempK;
        for (i = 0; i <k; i++) {
            a[i] = arr[rotate];
            rotate++;
        }

        for(int w=0;w<arr.length;w++){
            arr[w]=a[w];
        }
    }
}


                                                              // method 2

// import java.util.Arrays;

// public class Main {

//     public static void rev(int[] arr,int low,int high){
//         int temp=arr[low];
//         arr[low]=arr[high];
//         arr[high]=temp;
//         low++;
//         high--;
//     }
//     public static void leftrotate(int[] arr,int n ,int d){  // d is the location where will rotate 
            
//         rev(arr, 0, d-1);
//         rev(arr,d,n-1);
//         rev(arr,0,n-1);
//     }
//     public static void main(String[] args) {
//         int[] arr={2,3,4,5,6};
//         leftrotate(arr,arr.length-1,2);
//         System.out.println(Arrays.toString(arr));
//     }

// }