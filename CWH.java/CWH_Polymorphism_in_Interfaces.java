package sarvagyacode;

interface Camera2{
    void takeSnap();
    void recordVideo();
  
    default void record4K(){
        
        System.out.println("Recording in 4K...");
    }
}
interface Wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int number){
        System.out.println("Calling number "+ number);
    }
    void receiveCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements Camera2 , Wifi2{
    public void takeSnap(){
        System.out.println("Taking snap :) ");
    }
    public void recordVideo(){
        System.out.println("Recording video... ");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Sarvagya", "Satyam","Sohail"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }

    public void method2(){
        System.out.println("This is method 2");
    }
}

public class CWH_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        //This is a smartphone but , use it like a camera for now
        Camera2 c2 = new MySmartPhone2(); // Polymorphism
        //We can use camera methods only .we cannot use smartphone methods too
        //c2.getnetwork(); --Not allowed
        //c2.method2(); --Not allowed
        c2.record4K();

        MySmartPhone2 s2 = new MySmartPhone2();//Here we can use every method
    }
}
