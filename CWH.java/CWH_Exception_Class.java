import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
    
        return super.toString() + " I am toString";
    }
    @Override
    public String getMessage() {
    
        return super.getMessage()+ " I am getMessage";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
    
        return "Age cannot be greater than 150";
    }
    @Override
    public String getMessage() {
    
        return "Make sure you entered correct age";
    }
}

public class CWH_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        if(a<10){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                // System.out.println(e.getMessage());
                // System.out.println(e.toString());
                // System.out.println(e);
                e.printStackTrace(); // Helps to determine which error came and in which line
            }
        }
    }
}
