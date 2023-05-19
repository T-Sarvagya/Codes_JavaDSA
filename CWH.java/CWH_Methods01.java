package sarvagyacode;
//import java.util.Scanner;

class CWH_Methods01 {
    /*Agar static method banayenge to bina object banae call kr skte 
     * Warna object banana padega agr static ni likha samne to
     */
    
    static int maxImum(int a, int b){
        // a = 97;
        // b = 98;
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    } 
    public static void main(String[] args) {    
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        CWH_Methods01 obj = new CWH_Methods01();
        int z = obj.maxImum(x, y);

        //int z = maxImum(x, y);
        System.out.printf("Greater value between %d and %d is %d", x,y,z);
        */
        int[] marks = {55,76,89,56,97};
        change(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
/*
 * Array m value change ho jaati hai par integer mai nahi hoti 
 */
    }
    static void change(int[] x){
        x[0] = 99;
    }
}
