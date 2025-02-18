
public class Main {
    public static int lenOfLongestSubarr(int[] arr, int k) {
        int sum = 0;
        int maxSubArray = 0; 
        int countMaxSubArray = 1; 
        for (int i = 0; i < arr.length; i++) { 
            sum = 0; 
            countMaxSubArray = 0; 
            
            for (int j = i; j < arr.length; j++) { 
                sum += arr[j]; 
                countMaxSubArray++; 
                System.out.println("new sum "+sum);
                if (sum == k) { 
                    if (countMaxSubArray > maxSubArray) {
                        maxSubArray = countMaxSubArray; 
                    }
                } 
            }
        }
        return maxSubArray;
    }
    public static void main(String[] args) {
        int[] arr={-59 ,-25, 58, -59, -25, 58};
        
        System.out.println(lenOfLongestSubarr(arr,-85));
    }
}
