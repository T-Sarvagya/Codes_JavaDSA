package sarvagyacode;

class Base1{
    Base1(){
        System.out.println("I am a constructor in base class");
    }
    Base1(int a){
        System.out.println("I am an overloaded constuctor in base class with value of a as " +a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(95);
        System.out.println("I am a constructor in derived class");
    }
    Derived1(int a,int b){
        //super(17);
        super(a);
        System.out.println("I am an overloaded constuctor in derived class with value of b as " +b);
    }
}
class GrandDerived extends Derived1{
    GrandDerived(){
        System.out.println("I am a constuctor in grand derived class");
    }
    GrandDerived(int a, int b, int c){
        super(a, b);
        System.out.println("I am an overloaded constuctor in grandderived class with value of c as " +c);
    }
}
//First base class constructor will work nd then derived class 
public class CWH_Constructor_in_inheritance {
    public static void main(String[] args){
       // Base1 b = new Base1();
       // Derived1 d = new Derived1();
       // Derived1 d1 = new Derived1(14,5);
       // GrandDerived g = new GrandDerived();       
        GrandDerived g1 = new GrandDerived(1,2,3);       

    }
}
