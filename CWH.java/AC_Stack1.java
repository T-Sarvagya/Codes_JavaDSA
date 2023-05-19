import java.util.*;

public class AC_Stack1 {

    //Que 1: Push element at bottom || Que 3
    public static void pushAtBottom(Stack<Integer> s, int data){
        //Base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    //Que 2: Reverse a string 
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            char curr = str.charAt(idx);
            s.push(curr);
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    //Que 3: Reverse a stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args){
        //Que 1:

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 0);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        //Que 2:

        // String str = "sarvagya";
        // String result = reverseString(str);
        // System.out.println("Reversed string is:" +result);

        //Que 3:

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
