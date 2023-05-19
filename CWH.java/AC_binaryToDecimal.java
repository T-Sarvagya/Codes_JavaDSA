public class AC_binaryToDecimal {

    public static void binToDec(int binNum){
        int temp = binNum;
        int decNum = 0;
        int pow = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit*(int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+temp+" = "+decNum);
    }
    public static void main(String[] args) {
        binToDec(110);
    }
}
