
public class NaturalNumber {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        while(n>5)return;
        System.out.println(n);
        n++;
        print(n);
    }
}
