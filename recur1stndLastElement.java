import java.util.Scanner;

class recur1stndLastElement {
    public static int first = -1;
    public static int last = -1;

    public static void getIndices(String str , char e1 , int index){
       
        if(index==str.length()){
            return;
        }

        if(str.charAt(index)==e1){
            if (first==-1)
            first = index;
            else
            last = index;
        }
        getIndices(str, e1, index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the element to find its occurrence");
        char e1 = 'a';
        getIndices(str, e1, 0);
        System.out.println("First occurence "+ first);
        System.out.println("Last occurence "+ last);

    }
}
