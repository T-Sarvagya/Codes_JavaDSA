public class AC_heightOfBT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){//O(n)
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;

        return height;
    }
    public static int count(Node root){//O(n)
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }
    public static int sum(Node root){//O(n)
        if(root == null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum + rsum + root.data;
    }
    public static int diameter1(Node root){//O(n^2)
        if(root == null){
            return 0;
        }
        int leftDiam = diameter1(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter1(root.right);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(selfDiam , Math.max(rightDiam, leftDiam));
    }
    //Diameter approach 2 -- TC = O(n)
    static class Info{
        int diam;
        int ht;

        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){ // O(n)
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam), leftInfo.ht + rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam , ht);
    }
    public static void main(String[] args) {
         /*
                1
               / \
              2   3
             / \   \
            4  5    6
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.right = new Node(6);

        //  int height = height(root);
        //  System.out.println("Height of BT is: "+height);
        //  int count = count(root);
        //  System.out.println("Count of nodes is: "+count);
        //  int sum = sum(root);
        //  System.out.println("Sum of BT is: "+sum);

        int diameter = diameter1(root);
       // System.out.println("Diameter of tree is: "+ diameter);

        System.out.println(diameter(root).diam);
    }
}
