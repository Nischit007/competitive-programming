

public class SelectionSort {
    public static void selectionSort(int[] arr){
       int n=arr.length;
       for(int i =0;i<n-1;i++){
        int mini=i;
        for(int j=i+1;j<n;j++){
            if(arr[mini]>arr[j]){
                mini=j;
            }
        }
        int temp=arr[mini];
        arr[mini]=arr[i];
        arr[i]=temp;
       }
    }
    
    public static void main(String[] args) {
        int[] arr={2,1,7,8,3,4};
        selectionSort(arr);
        for(int c:arr){
            System.out.println(c);
        }

       
   
    }

}
