package sarvagyacode;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4K(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling number "+ number);
    }
    void receiveCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Camera , Wifi{
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
    // public void record4K(){
    //     System.out.println("HEHEHEHE");
    // } 
}

public class CWH_Default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String [] ar = ms.getNetwork();
        for (String item :ar ) {
            System.out.println(item);
        }

        ms.connectToNetwork("Satyam");
        ms.record4K();

    }
}
