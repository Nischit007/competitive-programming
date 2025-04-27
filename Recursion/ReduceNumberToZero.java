public class ReduceNumberToZero {
	
    public static int reducerToZero(int n ,int count){
        if(n==0)return count;

        if(n%2==0){
        count ++;
        return reducerToZero(n/2,count);
        }else{
            count ++;
        return reducerToZero(n-1,count);
        }
    
    }
    
        public static void main(String[] args) {
            int count=reducerToZero(41,0);
            System.out.println(count);
        }
    }
    