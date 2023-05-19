public class AC_oddEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            //even
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        int n = 0;
        oddOrEven(n);
    }
}
    

