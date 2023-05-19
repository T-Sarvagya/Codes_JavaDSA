public class AC_optimizedRecrXpowN {
    public static int power(int x, int n){
        // Time Complexity = O(n)
        int pow;
        if(n==0){
            return 1;
        }
        return pow = x* power(x, n-1);
    }
    public static int omptimisedPow(int x , int n){
        // Time Complexity = O(logn)
        if(n==0){
            return 1;
        }
        int halfpow = omptimisedPow(x, n/2);
        int halfPowSq = halfpow * halfpow; //TC = O(logn)
        //int halfPowSq = omptimisedPow(x, n/2) * omptimisedPow(x, n/2); // TC = O(n)

        //if n is odd
        if(n%2 !=0){
            halfPowSq = x*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println("Power is :"+power(2, 10));
        System.out.println("Optimised power code:"+omptimisedPow(3, 3));
    }
}
