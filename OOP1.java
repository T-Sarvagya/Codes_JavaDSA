import java.util.*;

class Pen{
    String color;
    String type;

    Pen(){
        
        System.out.println("Constructor called");
    }
    public void getInfo(){
        System.out.println("Color of pen is:"+ this.color);        
        System.out.println("Color of type is:"+ this.type);        
    }
}

class OOP1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pen P1 = new Pen();
       // P1.color = sc.nextLine();
        P1.color = "Blue";
        P1.type = "Ball pen point";
        P1.getInfo();

        Pen P2 = new Pen();
        P2.color = "Black";
        P2.getInfo();
    }
}
