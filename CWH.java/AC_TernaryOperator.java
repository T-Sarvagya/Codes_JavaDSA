public class AC_TernaryOperator {
    public static void main(String[] args){
        int number = 4;
        String type = (number%2 == 0)?"even":"odd";
        System.out.println(type);

        int num2 = 7;
        int large = (number>num2)?number:num2;
        System.out.println("Larger number is: "+ large);
    }
}
