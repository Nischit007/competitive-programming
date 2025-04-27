import java.util.ArrayList;



// in arguments we are passing array, index, target and list
public class FirstAndLastOccurInArray {
    public static ArrayList<Integer> LinearSearch(int[] arr,int index,int target,ArrayList<Integer> list)	{
        if(index>arr.length-1)return list;
 
        if(arr[index]==target){
            if(index<arr.length-1){
            	if(arr[index]!=arr[index+1] || arr[index]!=arr[index-1]){
            list.add(index);
            }   
        }
        }
        index++;
        return LinearSearch(arr,index,target,list);
        }
    
    
     public static void main(String[] args) {
            int[] arr={1,3,6,4,4,4,4,7,5,10,2,100,100,50};
        int target=4;
        ArrayList<Integer> list=new ArrayList<>();
            ArrayList<Integer> newList=LinearSearch(arr,0,target,list);
            for(int i=0;i<newList.size();i++){
                System.out.print(newList.get(i)+" ");
            }
            System.out.println();
     }   
    }
    
    
    // without passing list in parameter  as argument