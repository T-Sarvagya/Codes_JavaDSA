package sarvagyacode;

abstract class Parentt1{
    public void print(){
        System.out.println("Printing..");
    }
    abstract public void greet();
}
class Childd1 extends Parentt1{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    //If we will not override abrstarct method from parent class then we have to make child class abstract too see in child2
    //Jitni methods abstract hongi parent class m unn har method ko override krna hoga child class m ni to child class ko bhi abstract banana hoga
}
abstract class Childd2 extends Parentt1{
    public void treat(){
        System.out.println("Here's your luck");
    }
}

public class CWH_Abstract{
    public static void main(String[] args) {
        //Abstract class ke object ni bante
        //Parentt1 p = new Parentt1(); -- error
        //Childd2 ch = new Childd2(); --error
        Childd1 c = new Childd1();//--> Iska object bana skte kyuki ye abstract ni h
        //It is possible to create reference of abstract class
        Parentt1 p1 = new Childd1();
        //Parentt1 p12 = new Childd2(); --Child must not be abstract
        
    }
}