import java.util.Scanner;

public class AC_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year%4)==0;
        boolean y = (year%100) !=0;
        boolean z = (year%100 ==0 && year%400 ==0);

        if(x &&(y||z)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }




        //My code
        // System.out.println("Enter year: ");
        // int num = sc.nextInt();

        // if(num%4==0){
        //     if(num%100==0){
        //         if(num%400==0){
        //             System.out.println("Leap year");
        //         }
        //         else{
        //             System.out.println("Not a leap year");
        //         }
        //     }
        //     else{
        //         System.out.println("Leap year");
        //     }
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }
    }
}
