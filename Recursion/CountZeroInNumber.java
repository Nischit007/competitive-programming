public class CountZeroInNumber {


	public static int countZero(int n,int count){
	if(n==0) return count;
	int digit=n%10;
	if(digit==0) count++;
	return countZero(n/10,count);
	}

    public static void main(String[] args) {
        System.out.println(countZero(1202045000,0));
    }
}
