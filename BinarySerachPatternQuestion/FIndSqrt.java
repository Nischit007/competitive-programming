
class FIndSqrt {
		
    public static long floorSqrt(long n) {
      long ans=0;
      long start=0;
      long end=n;
      
      while(start<=end){
      	long mid=(start+end)/2;
      	if(mid*mid>=n){
      	ans=mid;
      	end=mid-1;
      	}else{
      	start=mid+1;
      	} 	
      }
	return ans;
    }



    public static void main(String[] args) {
        long c=floorSqrt(49);
        System.out.println(c);
    }
}


