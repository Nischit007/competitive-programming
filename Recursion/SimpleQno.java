import java.util.Arrays;

public class SimpleQno {
    public static void ReverseOrderInsertInReverse(int[] arr,int n,int i){
        if(n==0)return ;
        ReverseOrderInsertInReverse(arr,n-1,i+1);

        System.out.println(n+" in "+i);
         arr[i]=n;
         System.out.println(n);
    }





    public static void ReverseOrderInsert(int[] arr,int n,int i){
        if(n==0)return ;
        

        arr[i]=n;
        System.out.println(n+" in "+i);
         ReverseOrderInsert(arr,n-1,i+1);
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr=new int[n];
        // ReverseOrderInsert(arr,n,0);
        // System.out.println("Array in reverse order:" + Arrays.toString(arr));

        ReverseOrderInsertInReverse(arr,n,0);
        System.out.println("Array in reverse order:" + Arrays.toString(arr));
    }
}
