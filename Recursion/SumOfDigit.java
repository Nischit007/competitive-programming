


public class SumOfDigit {

    public static int sum(int n){
        if(n==0)return 0;
        int digit=n%10;
        return digit+sum(n/10);
    }



    public static void main(String[] args) {
        int n=1234;
        System.out.println(sum(n));        
    }
}
