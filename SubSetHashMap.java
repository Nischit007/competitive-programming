
import java.util.HashMap;

public class SubSetHashMap {

    public static int longestSubset(int[] arr,int k){
        int longSubSet=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0, -1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                int newLen=map.get(sum-k);
                longSubSet=Math.max(longSubSet,i-newLen);
                // System.out.println(longSubSet);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return longSubSet;
    }

    

    public static void main(String[] args) {
        int[] arr={7,3,9,2,1,5,1,10,8};
        int subset=longestSubset(arr,9);
        System.out.println(subset);

    }
}
