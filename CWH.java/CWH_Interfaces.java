package sarvagyacode;

interface Bicycle{
    int a = 23;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn1();
    void blowHorn2();
}
class AvonCycle implements Bicycle, HornBicycle{
    int speed = 50;
    
    public void applyBrakes(int decrement){
        speed = speed - decrement;
        System.out.format("Speed decreased by %d and now speed is %d\n",decrement,speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.format("Speed increased by %d and now speed is %d\n",increment,speed);
    }
    public void blowHorn1(){
        System.out.println("Blowing horn");
    }
    public void blowHorn2(){
        System.out.println("Pee Poo Blowing horn");
    }
}
abstract class A1 implements Bicycle{
    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }
}

public class CWH_Interfaces {
    public static void main(String[] args) {
        //Bicycle b1 = new Bicycle() ; -- we can not intantiate or create obj of interface
        AvonCycle a1 = new AvonCycle();
        a1.applyBrakes(5);
        //You can create properties in interfaces
        System.out.println(a1.a);
        //You cannot modify properties of interfaces as they are final
        //a1.a = 454; --error
        // We can create reference of interface
        Bicycle b = new AvonCycle();
        
    }
}
