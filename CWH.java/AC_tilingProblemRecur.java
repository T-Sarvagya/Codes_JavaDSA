public class AC_tilingProblemRecur {
    public static int tilingProb(int n){ // 2xn (board size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam --> choice lena
        //vertical choice
        int fnm1 = tilingProb(n-1);
        //horizontal choice
        int fnm2 = tilingProb(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println("Total ways are:"+ tilingProb(n));
    }
}
