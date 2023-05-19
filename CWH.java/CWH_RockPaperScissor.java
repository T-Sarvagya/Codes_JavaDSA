package sarvagyacode;
import java.util.Scanner;
import java.util.Random;

class CWH_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i<=5){
        System.out.println("Enter a number");
        System.out.println("0.Rock\n1.Scissor\n2.Paper");
        int userInput = sc.nextInt();

        Random ran = new Random();
        int compInput = ran.nextInt(3);
    
        if(userInput == compInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && compInput==1 || userInput==2 && compInput==0 || userInput==1 &&compInput==2){
            System.out.println("You WIN!!");
        }
        else{
            System.out.println("Computer WIN!!");
        }
        //System.out.println("Computer choice :"+ compInput);
        if(compInput==0){
            System.out.println("Computer choice : Rock");
        }
        else if(compInput==1){
            System.out.println("Computer choice : Scissor");
        }
        else {
            System.out.println("Computer choice : Paper");
        }
        i++;
    }
    }
}
