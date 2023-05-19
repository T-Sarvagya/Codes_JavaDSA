public class AC_friendPairRecur {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //kaam --> choices
        //sinlge
        int fnm1 = friendPairing(n-1);
        //pair
        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1)* fnm2;
        //total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println("Total ways of pairing are:"+friendPairing(4));
    }
}
