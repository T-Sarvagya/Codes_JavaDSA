import java.util.*;

class recursion2 {
    //Program to reverse a string "abcd" = "dcba"
    public static String revString(String str){
        if(str.length()==1){
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        //String str = "abcd";
        String reversed = revString(str);
        System.out.println(reversed);
    }
}
