package sarvagyacode;

class Base{
    int x;
    public void setX(int x){
        System.out.println("I am in base class and setting x");
        this.x = x;
    }

    public int getX(){
        return x;
    }
}
class Derived extends Base{
    int y;

    public void setY(int y){
        System.out.println("I am in derived class and setting y");
        this.y = y;
    }

    public int getY(){
        return y;
    }
}

public class CWH_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.setX(15);
        System.out.println(b.getX());
        d.setX(45);
        System.out.println(d.getX());
        d.setY(21);
        System.out.println(d.getY());
    }
}
