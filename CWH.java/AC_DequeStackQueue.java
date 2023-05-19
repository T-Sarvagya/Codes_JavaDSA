import java.util.*;

public class AC_DequeStackQueue {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }

    static class Queue{
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());

        Queue q = new Queue();
        q.add(1);
        q.add(4);
        q.add(7);
        System.out.println(q.peek());
    }
}
