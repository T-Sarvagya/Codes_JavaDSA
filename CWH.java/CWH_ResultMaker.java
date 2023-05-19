package sarvagyacode;
import java.util.Scanner;

class CWH_ResultMaker {
    public static void main(String[] args) {
        int math, chem, phy;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths marks: ");
        math = sc.nextInt();
        System.out.println("Enter physics marks: ");
        phy = sc.nextInt();
        System.out.println("Enter chemistry marks: ");
        chem = sc.nextInt();

        avg = (math+chem+phy)/3.0f;
        if(avg<40){
            System.out.println("FAIL");
            System.out.println("Your avg is less than 40 i.e. "+avg);
        }else{
            if(math<33){
                System.out.println("FAIL");
                System.out.println("Your maths marks is less than 33 i.e. "+math);
            }
            else if(phy<33){
                System.out.println("FAIL");
                System.out.println("Your physics marks is less than 33 i.e. "+phy);
            }
            else if(chem<33){
                System.out.println("FAIL");
                System.out.println("Your chemistry marks is less than 33 i.e. "+chem);
            }
            else{
                System.out.println("CONGRATULATIONS!! You are passed with percentage:"+avg+"%");
            }
        }
        System.out.println("Thank you for using this code");
    }
}
