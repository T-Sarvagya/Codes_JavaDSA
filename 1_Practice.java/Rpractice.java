import java.util.*;

class Rpractice {
    public static void main (String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        
        //a = sc.nextInt();
        //b = sc.nextInt();
        a=10;
        b=20;
        a = a-b;//-10
        b = b+a;//10
        a= b-a;//20
        System.out.println("Value of a is:"+ a);
        System.out.println("Value of b is:"+ b);
        
    }
}
