public class AC_IsPalindrome {
    public static void isPalindrome(int n){
        int temp = n;
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse = reverse *10 + lastDigit;
            n = n/10;
        }
        if(reverse==temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        isPalindrome(123321);
    }
}
