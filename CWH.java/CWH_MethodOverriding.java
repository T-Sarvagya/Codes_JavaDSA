package sarvagyacode;

class A{
    int a = 6;
    public int num(){
        return 1;
    }
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}
class B extends A{
    @Override  // Override notation => ye ek notation h jo batata h ki aapne method ko override kr rkha hai
    public void meth1(){// Method Overriding
        System.out.println("I am method 1 of class B");
    }

    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}

/*
 * We cannot override static method
 * We cannot override final method
 * If we change access modifier then it is no longer method overriding
 * Read rules for the method overriding
 */

public class CWH_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
