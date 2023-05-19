public class AC_linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;//Initially intializing next with null considering only 1 element
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){//O(1)
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        //if node is null
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step2 = newnode next = head
        newNode.next = head;//link
        //step3 head  = newNode
        head = newNode;
    }

    public void addLast(int data){//O(1)
        //step1 - create a new node
        Node newNode = new Node(data);
        size++;
        //if ll is empty
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step2 - link
        tail.next = newNode;
        //step3
        tail = newNode;
    }
    public void addMiddle(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i=idx-1; temp->previos
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    public void printLL(){//O(n)
        // if(head ==null){
        //     System.out.println("Linked list is empty");
        //     return;
        // }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev: i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static int itrSearch(int key){//O(n)
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int helper(Node head, int key){//O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recurSearch(int key){
        return helper(head, key);
    }
    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthFrmEnd(int n){//O(n)
        //Calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        
        if(n==sz){//delete head
            head = head.next;
            return;
        }
        int i=1;
        Node prev = head;
        int idxToFind = sz-n;
        while(i<idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){ //helper function for palindrome
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is midNode
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1: find mid
        Node midNode = findMid(head);
        //step2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right part head
        Node left = head; //left part head
        //step3: check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //LINKED LIST PART 2
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow==fast){
                return true; //Cycle exists 
            }
        }
        return false; //Cycle dosen't exist
    }
    public static void removeCycle(){
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point .
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;

    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid
    }
    private Node merge(Node left , Node right){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next; //next kyuki -1 wale ko ni rkhna ll m
    }
    public Node mergeSort(Node head){ //O(nlogn)
        //Base case
        if(head ==null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right half merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft , newRight);
    }

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //alternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        AC_linkedList ll = new AC_linkedList();
        // ll.printLL();
        // ll.addFirst(2);
        // ll.printLL();
        // ll.addFirst(1);
        // ll.printLL();
        // ll.addLast(4);
        // ll.printLL();
        // ll.addLast(5);
        // ll.printLL();
        // ll.addMiddle(2, 3);
        // ll.printLL();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.itrSearch(3));
        // ll.reverse();
        // ll.printLL();
        // ll.deleteNthFrmEnd(3);
        // ll.printLL();

    //     ll.addLast(1);
    //     ll.addLast(2);
    //     ll.addLast(2);
    //    // ll.addLast(1);
    //     ll.printLL();
    //     System.out.println(ll.checkPalindrome());



    //LINKED LIST PART-2
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2->3->2 //cycle exists
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        //Merge sort
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(8);
        ll.addLast(9);
        ll.printLL();
        Node n = ll.mergeSort(head);
        ll.printLL();
        ll.zigZag();
        ll.printLL();
        

    }
}
