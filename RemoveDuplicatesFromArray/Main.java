
public class Main {
   public static void main(String[] args){
        int[] arr={1,1,2,3,4,4,5};
        int n=arr.length;
        int i =0;
        int j=1;
        while(i!=n){
            if(arr[i]!=arr[j]){
                arr[j]=arr[i];
                i++;
                j++;
            }else{
                i++;
            }
        }
       while(j!=n){
        arr[j]=0;
        j++;
       }
        for(int c:arr){
            System.out.println(c);
        }
   }
}
