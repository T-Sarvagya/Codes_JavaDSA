package sarvagyacode;
//import java.util.Scanner;

class CWH_Recursion {
    static int facorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * facorial(n-1);
        }
    }
    static int facorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product =1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }

    static void fibonnacii_iterative(int n){
        if(n==1){
            System.out.print(0);
        }
        else{
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b+ " ");
        for(int i=2;i<n;i++){
        int c = a+b;
        System.out.print(c + " ");
        a = b;
        b = c;
        }
        }
    }

    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==2 || n==1){
            return 1;
        }
       
        return fibonacci(n-2) + fibonacci(n-1);
      
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return n+ sum(n-1);
        }
    }

    static void pattern_rec(int k){
        if(k>0){
            pattern_rec(k-1);
            for(int i=0;i<k;i++){
                System.out.print("*"+ " ");
            }
            System.out.println();
            // pattern_rec(k-1); (Agr pattern ko reverse print krna h to last m recursive call lagayenge)
        }
    }
    /*pattern_rec(3)
     * pattern_rec(2) + 3 times star and new line
     * pattern_rec(1) + 2 times star and new line + 3 times star and new line
     * pattern_rec(0) + 1 time star nd new line + 2 times star and new line + 3 times star and new line
    */


   
  
public static void main(String[] args) {
    // System.out.println(facorial(5));
    // System.out.println(facorial_iterative(4));
    // fibonnacii_iterative(5);
    // System.out.println();
    // int n=7;
    // for(int i=0;i<2;i++){
    //     System.out.print(fibonacci(i)+ " ");
    // }

    // System.out.println(sum(4));
    pattern_rec(7);


}
}