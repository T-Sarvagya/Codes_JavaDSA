public class AC_decToBin {

    public static void decToBin(int n){
        int temp = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.printf("Binary coversion of %d is: %d",temp,binNum);
    }
    public static void main(String[] args) {
        decToBin(10);
    }
}
