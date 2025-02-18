

public class Main {
    public static int differenceOfSums(int n, int m) {
        int i=1;
        int divisible=0;
        int total=0;
        while(i<=n){
            if(i%m==0){
                divisible=divisible+i;
            }else{
            total=total+i;
            i++;
            }
        }
        System.out.println("divisible"+divisible);
        System.out.println("total"+total);
        return total-divisible;
    }
    public static void main(String[] args) {
        int value=differenceOfSums(10,3);
        System.out.println(value);
    }
}
