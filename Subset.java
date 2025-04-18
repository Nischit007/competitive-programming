public class Subset {

    public static boolean isSubsetSum(int[] arr,int k){

        int n=arr.length;

        boolean dp[][]=new boolean[n+1][k+1];

        for(int i =0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 &&j==0 ){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else{
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }else{
                        int val=arr[i-1];
                        if(val<=j){
                        if(dp[i-1][j-val]==true){
                            dp[i][j]=true;
                        }
                        }
                    }
                }
            }
        }

        


        return dp[n][k];



    }




    public static void main(String[] args) {
        int[] arr = {7, 34, 8, 1 ,12, 1, 3};
        int k = 9;
        System.out.println(isSubsetSum(arr, k));
    }
}
