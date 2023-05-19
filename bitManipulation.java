import java.util.*;

class bitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get bit --> bit mask(1<<position) AND number\
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the position ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if((bitMask & num)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
