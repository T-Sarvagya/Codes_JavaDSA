import java.util.Scanner;

/*
 * Income< 5L --> No tax
 * Income between 5L to 10L --> 20 %  tax
 * Income> 10L --> 30 % tax
 */
public class AC_TaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary/income: ");
        int income = sc.nextInt();
        double tax;

        if(income<500000){
            tax = 0;
        } else if(income>=500000 && income<1000000){
            tax = income * 0.2;
        } else{
            tax = income * 0.3;
        }

        System.out.println("Your tax is: "+ tax);
    }
}
