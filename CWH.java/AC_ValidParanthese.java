import java.util.*;

public class AC_ValidParanthese {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){//opening
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
                ||(s.peek() == '{' && ch == '}')
                ||(s.peek() == '[' && ch == ']')){
                    s.pop();
                }else{
                    //pair form ni hua
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            //agr last m stack m kuch bach jae
            return false;
        }
    }
    public static void main(String[] args){
        String str = "([]){}";
        String str2 = "([]}";
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}
