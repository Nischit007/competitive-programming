public class LinearSearch {
	public static boolean LinearSearchs(int[] arr,int index,int target)	{
	if(index>arr.length-1)return false;
	
	if(arr[index]==target)return true;
	
	index++;
	return LinearSearchs(arr,index,target);
	}
		


    public static void main(String[] args) {
    int[] arr={1,3,4,6,7,5,0,10,2,100,50};
    int target=00;
       System.out.println(LinearSearchs(arr,0,target));
    }
}
