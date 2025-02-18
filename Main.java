
import java.util.HashSet;

public class Main {

    public static  int[] unique(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int[] newArr=new int[set.size()];
        int i=0;
        for(int narr:set){
            newArr[i]=narr;
            i++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,2,3,5,6,4};
        int[] newarr=unique(arr);
        for(int n:newarr){
            System.out.print(n+" ");
        }
    }
}