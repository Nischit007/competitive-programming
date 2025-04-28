public class ReverseAnArray {
    public static void ReverseArray(int[] arr,int i,int j){
        if(i>=j)return ;

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println(arr[i]+" "+arr[j]);
        ReverseArray(arr,i+1,j-1);
    }


   
    public static void reverse(int[] arr, int n) {
        ReverseArray(arr,0,arr.length-1);

    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
