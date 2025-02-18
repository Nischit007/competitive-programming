

//     public static int fibonacii(int n){
//         if(n==0){
//             return 0;
//         }else if(n==1){
//             return 1;
//         }else{
//             return fibonacii(n-1)+fibonacii(n-2);
//         }
//     }

//     public static void main(String[] args) {
//         int n=10;
//         for(int i =0;i<n;i++){
//             System.out.println(fibonacii(i));
//         }
//     }
// }


public class Fibonacii {

    public static void main(String[] args) {
        
        int n=10;

        int dpp[]=new int[n];

        dpp[0]=0;
        dpp[1]=1;

        for(int i=2;i<n;i++){
        dpp[i]=dpp[i-1]+dpp[i-2];
    }

    for(int i=0;i<n;i++){
        System.out.print(dpp[i]+" ");
    }
}
}