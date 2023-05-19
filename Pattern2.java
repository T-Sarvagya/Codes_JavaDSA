import java.util.*;
class Primenum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
       if(isPrime){
           if(n==1){
               System.out.println("Neither prime not composite");
           } else{
               System.out.println("Prime number");
           }
       } else{
           System.out.println("Not a prime number");
       }
    }
}
