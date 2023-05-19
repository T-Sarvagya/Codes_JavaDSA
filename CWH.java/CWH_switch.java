package sarvagyacode;
import java.util.Scanner;

class CWH_switch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        /*switch(age){
            case 18 -> System.out.println("You are going to become an adult");
            case 20 -> System.out.println("You leaved your teen");
            case 23 -> System.out.println("You are eligible for marriage");
            default -> System.out.println("Enjoy your life");
        }
        */

        switch(age){
            case 18: {
                 System.out.println("You are going to become an adult");
                 break;
            }
            case 20 :{
                System.out.println("You leaved your teen");
                break;
            }
            case 23 :{
                 System.out.println("You are eligible for marriage");
                 break;
            }
            default :{
                 System.out.println("Enjoy your life");
            }
        }
    }
}
