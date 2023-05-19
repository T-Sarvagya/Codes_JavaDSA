public class AC_LinkedListPractiseQue {
    //Que1: || Que3 -> Node class 
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public Node getInsertionNode(Node head1, Node head2){//O(m*n)
        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    //Que 2:
    static class Node1{
        int data;
        Node1 next;
    }
    static Node1 push(Node1 head_ref, int new_data){
        Node1 newNode = new Node1();
        newNode.data = new_data;
        newNode.next = head_ref;
        head_ref = newNode;
        return head_ref;
    }
    static void print(Node1 head){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static void skipMdeleteN(Node1 head, int M, int N){
        Node1 curr = head, t;
        int count;
        while(curr != null){
            for(count=1; count<M && curr != null ; count++){
                curr = curr.next;
            }
            if(curr == null){
                return;
            }
            t = curr.next;
            for(count=1; count<=N && t != null ; count++){
                Node1 temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    //Que 3: || print3, push3 and head function same for Que4
    static Node head;
    static void print3(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static void push3(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    static void swapXY(int x, int y){
        if(x == y){
            return;
        }
        Node prevX = null , currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null , currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        if(currX == null || currY == null){
            return;
        }
        if(prevX != null){
            prevX.next = currY;
        }else{
            head = currY;
        }
        if(prevY != null){
            prevY.next = currX;
        }else{
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    //Que 4:
    static Node segregateEvenOdd(){
        Node even = null , odd = null , e = null , o = null;
        while(head != null){
            if(head.data % 2 == 0){
                if(even == null){
                    even = head;
                    e = head;
                }else{
                    e.next = head;
                    e = e.next;
                }
            }else{
                if(odd == null){
                    odd = head;
                    o = head;
                }else{
                    o.next = head;
                    o = o.next;
                }
            }
            head = head.next;
        }
        if(e != null){
            e.next = odd;
        }
        if(o != null){
            o.next = null;
        }
        if(even != null){
            return even;
        }else{
            return odd;
        }
    }
    public static void main(String[] args) {
       AC_LinkedListPractiseQue list = new AC_LinkedListPractiseQue();
       //Que 1
    //    Node head1 , head2;
    //    head1 = new Node(10);
    //    head2 = new Node(3);
    
    //    Node newNode = new Node(6);
    //    head2.next = newNode;

    //    newNode = new Node(9);
    //    head2.next.next = newNode;

    //    newNode = new Node(15);
    //    head1.next = newNode;
    //    head2.next.next.next = newNode;

    //    newNode = new Node(30);
    //    head1.next.next = newNode;

    //    head1.next.next.next = null;

    //    Node insertionPoint = list.getInsertionNode(head1, head2);
    //    if(insertionPoint == null){
    //     System.out.println("No insertion point");
    //    }else{
    //     System.out.println("Insertion point is:"+ insertionPoint.data);
    //    }

       //Que 2:
    //    Node1 head = null;
    //    int M =2 , N =2;
    //    head = push(head, 10);
    //    head = push(head, 9);
    //    head = push(head, 8);
    //    head = push(head, 7);
    //    head = push(head, 6);
    //    head = push(head, 5);
    //    head = push(head, 4);
    //    head = push(head, 3);
    //    head = push(head, 2);
    //    head = push(head, 1);

    //    System.out.printf("M = %d, N = %d"+"LinkedList is:",M,N);
    //    print(head);
    //    skipMdeleteN(head, M, N);
    //    System.out.println("After skipping and deletion");
    //    print(head);

    //Que 3:
    // list.push3(7);
    // list.push3(6);
    // list.push3(5);
    // list.push3(4);
    // list.push3(3);
    // list.push3(2);
    // list.push3(1);

    // int x = 4, y = 7;
    // System.out.println("Linked list before swap:");
    // list.print3(head);
    // list.swapXY(x, y);
    // System.out.println("Linked list after swap");
    // list.print3(head);

    //Que 4:

    list.push3(17);
    list.push3(6);
    list.push3(52);
    list.push3(43);
    list.push3(31);
    list.push3(2);
    list.push3(17);
    System.out.println("Linked list befor segregation:");
    list.print3(head);
    list.segregateEvenOdd();
    System.out.println("Linked list after segregation:");
    list.print3(head);
    }
}
