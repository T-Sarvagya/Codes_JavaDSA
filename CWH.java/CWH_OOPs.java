package sarvagyacode;
import java.util.Scanner;


class Employee1{
    int id;
    String name;
    public void printDetails(){
        System.out.print("My id is "+ id);
        System.out.println("  and my name is "+ name);
    }
}

class CWH_OOPs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee1 Sarvagya = new Employee1();
        Sarvagya.id = 19;
        Sarvagya.name = "Sarvagya tiwari";
        //System.out.println(Sarvagya.id);
        //System.out.println(Sarvagya.name);
        Sarvagya.printDetails();

    }
}
