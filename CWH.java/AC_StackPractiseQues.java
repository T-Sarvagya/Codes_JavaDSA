import java.util.*;

public class AC_StackPractiseQues {
    // Que 1:
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Stack<Integer> s1 = new Stack<>();
        boolean ispalin = true;
        while(slow != null){
            s1.push(slow.data);
            slow = slow.next; 
        }
        while(head != null){
            int i = s1.pop();
            if(head.data == i){
                ispalin = true;
            }else{
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

    //Que 2:
    public static String simplifyPath(String path){
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for(int i=0; i<p.length;i++){
            //poping condition
            if(!s.isEmpty() && p[i].equals("..")){
                s.pop();
            }
            //pushing condition
            else if(!p[i].equals(".") && !p[i].equals(".") && !p[i].equals("..")){
                s.push(p[i]);
            }
        }
        
        if(s.isEmpty()){
            return "/";
        }
        while(!s.isEmpty()){
            res.insert(0, s.pop()).insert(0, "/");
        }

        return res.toString();
    }
    public static void main(String[] args) {
        //Que 1: To find LL is palindrome or not
        // Node one = new Node(1);
        // Node two = new Node(2);
        // Node three = new Node(3);
        // Node four = new Node(4);
        // Node five = new Node(3);
        // Node six = new Node(2);
        // Node seven = new Node(1);
        // one.next = two;
        // two.next = three;
        // three.next = four;
        // four.next = five;
        // five.next = six;
        // six.next = seven;
        // boolean condition = isPalindrome(one);
        // System.out.println("Palindrome:"+condition);

        //Que 2:
        String path = "/a/./b/../../c/";
        String res = simplifyPath(path);
        System.out.println("Canonical path is:"+ res);
    }
}
