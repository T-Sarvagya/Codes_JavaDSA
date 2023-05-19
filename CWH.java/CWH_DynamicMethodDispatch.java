package sarvagyacode;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void print(){
        System.out.println("I am Java in phone");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void print(){
        System.out.println("I am Java in Smartphone");
    }
}

public class CWH_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
      //  obj.greet();

        //Reference super class nd object sub class is allowed
        Phone obj1 = new SmartPhone();  // Run time polymorphism
        obj1.greet();
        obj1.print();
        //We can class methods that are present in super class but if there is method overriding then sub class method will take place
        //obj1.swagat(); //Not valid

        //Reference subclass and obj super class is not valid
       // SmartPhone sm1 = new Phone(); // Not valid
    }
}
