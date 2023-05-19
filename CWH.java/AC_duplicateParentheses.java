import java.util.*;

public class AC_duplicateParentheses {
    public static boolean isDuplicate(String str){ //O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            //closeing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count ++;
                }
                if(count<1){
                    return true; //duplicate found
                }else{
                    s.pop(); //'('- ye pop krwaya
                }
            }
            else{ //opening, operator, operand
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //true
        String str2 = "(a+b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
