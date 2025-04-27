
public class Index {
    public static void hello(int n){
        System.out.println(n);
        if(n==0)return ;
        hello(n--);
        System.out.println("value of n is "+n);
    }


    public static void main(String[] args) {
        int n=5;
        hello(n--);
    }
}
