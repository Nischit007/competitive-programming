



//             // Convert Decimal to Binary
// public class Main {

//     public static String decimalToBinary(int n){
//         if(n==0)return "0";
//             String res="";
//             while(n>0){
//                 int rem=n%2;
//                 n=n/2;
//                 res=res+rem;
//             }
//             return res;

//     }

//    public static void main(String[] args) {
//         System.out.println(decimalToBinary(19));
//    } 
// }





            // // Convert Binary to Decimal
            // public class Main {

            //     public static int BinaryToDecimal(int n){
            //        int result=0;
            //         int i=0;
            //         while(n>0){
            //             int rem=n%10;
            //             n=n/10;
            //             result=result+(int)Math.pow(2,i)*rem;
            //             i++;

            //         }
            //         return result;
            
            //     }
            
            //    public static void main(String[] args) {
            //         System.out.println(BinaryToDecimal(10001));
            //    } 
            // }
            


// Bitwise Operator(AND,OR,XOR,NOT,left shift,right shift)




    // public class Main {
    // public static void main(String[] args) {
    //     System.out.println(5 | 6);
    //     System.out.println(5 ^ 6);
    //     System.out.println(5 & 6);
    // }
        
    // }




    // Bitwise left shift and right shift


    //left shift means *2
    //right shift means /2

    // public class Main {
    
    //     public static void main(String[] args) {
    //         System.out.println(5>>1);
    //         System.out.println(5<<1);
    //     }
    // }



    // Most Significant Bit and least Significant Bit 

    // left corner bit is most significant bit  and right corner least bit is significant
                        // 101


// public class Main {


//     public static void main(String[] args) {
//         int num=78;
//         if((78 & 1)==1){    
//             System.out.println("odd");
//         }else{
//             System.out.println("even");
//         }

//     }
// }




// check Kth bit is significant or not 
/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        
        int bit=10100;
        int k=3;

        if((bit>>(k-1)&1)==1){
            System.out.println("set");
        }else{
            System.out.println("not set");
        }
    }
}