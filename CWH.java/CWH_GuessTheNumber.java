package sarvagyacode;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setNoOfGuesses(int n){
        this.noOfGuesses = n;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt(); 
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.println("Yes you guessed it right , it was : "+ number);
            System.out.printf("You guessed it in %d attempts",noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
            return false;
    }

}

public class CWH_GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        
        }
    }
}
