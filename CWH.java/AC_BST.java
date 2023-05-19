import java.util.*;

public class AC_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right , val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data<val){
            root.right = delete(root.right, val);
        }else{
            //case 1: leaf node
            if(root.right == null && root.left == null){
                return null;
            }
            //case 2: one child
            if(root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
            //case 3: two child
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

     public static Node findInorderSuccesor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

    public static void printInRange(Node root , int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){//case 1
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data > k2){ //case 2
            printInRange(root.right, k1, k2);
        }else{// case 3
            printInRange(root.left, k1, k2);
        }
    }

    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static boolean isValidBST(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
     public static Node createMirror(Node root){
        if(root == null){
            return root;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        //int[] values = {5,1,3,4,2,7};
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length;i++){
            root = insert(root, values[i]);
        }

       // inorder(root);

        // if(search(root, 8)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }
        // System.out.println();
        // root = delete(root, 1);//leaf node
        // inorder(root);
        // System.out.println();
        // root = delete(root, 10);//one child
        // inorder(root);
        // System.out.println();
        // root = delete(root, 5);//two child
        // inorder(root);

        //printInRange(root, 5, 12);

       // printRoot2leaf(root, new ArrayList<>());

       System.out.println(isValidBST(root, null, null));
       preorder(root);
       System.out.println();
       createMirror(root);
       preorder(root);
    }
}
