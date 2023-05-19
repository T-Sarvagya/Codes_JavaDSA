import java.util.*;

class recursion{
    public static void printSum(int n , int sum, int i){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(n, sum, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int n = sc.nextInt();
        System.out.println("Enter the value");
        int x = sc.nextInt();
        //int sum = 0;
        //int i = n;
        //int fact = 1;
        //printSum(n, sum, i);
        //factorial(n, fact);
        //int ans = calPower(x, n);
        int ans = calPower2(x, n);
        System.out.println(ans);
    }
    
    public static void factorial(int n, int fact){
        if(n==1){
            fact *= n;
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n-1, fact);
    }

    public static int calPower(int x , int n){ //stack height n
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        int xpownm1 = calPower(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static int calPower2(int x , int n){ // stack height logn
        if(n==0) //base case 1
        return 1;
        if(x==0) //base case 2
        return 0;
        // if n is even
        if(n%2 ==0){
            return calPower2(x, n/2) * calPower2(x, n/2);
        }
        else // n is odd
        return calPower2(x, n/2) * calPower2(x, n/2) * x;
    }
}