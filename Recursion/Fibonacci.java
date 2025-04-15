
public class Fibonacci {
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
            System.out.print(Fibonacci(7)+" ");
        // }

    }
    static int Fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
           return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
