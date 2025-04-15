
public class Main {
    public static void main(String[] args) {
         //write a function , that print hello world
            message(5); 
    }

    static void message(int n){
        while(n==0)return;
        System.out.println("hello world");
        n--;
        message(n);
    }

}
