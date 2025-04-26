public class Reverse {
    static int rev = 0; 

    static void reverse(int n) {
        if (n == 0) return;
        int digit = n % 10;
        rev = rev * 10 + digit;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        reverse(n);
        System.out.println(rev); 
    }
}
