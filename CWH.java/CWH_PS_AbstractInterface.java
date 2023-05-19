package sarvagyacode;
import javax.sound.midi.Soundbank;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling pen");
    }
    void changeNib(){
        System.out.println("Changing nib of pen");
    }
}


public class CWH_PS_AbstractInterface {
    public static void main(String[] args) {
       FountainPen fp = new FountainPen();
       fp.changeNib();
       fp.refill();
       fp.write(); 
    }
}
