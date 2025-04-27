
public class CheckSortedArrayOrNot {
    public static boolean sortedOrNot(int [] arr ,int i,int j,int n){
    	if(j==n)return true;
    	
    	if(arr[i]<=arr[j]){
    	i++;
    	j++;
    	return sortedOrNot(arr,i,j,n);
    	}else{
    	return false;
    	}
    	
    }
    
    public static void main(String[] args) {
        int[] arr={2,3,10,6,7};
        System.out.println(sortedOrNot(arr,0,1,arr.length-1));
    }
}


