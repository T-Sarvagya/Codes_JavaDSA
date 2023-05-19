

abstract class AniMal{
    abstract void walk();
    void breathe(){
        System.out.println("This animal breathes air");
    }
    AniMal(){
        System.out.println("You are about to create an animal");
    }
}
class Horse extends AniMal{
    Horse(){
        System.out.println("Wow!!You created a horse");
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }  
}
class Penguin extends AniMal{
    Penguin(){
        System.out.println("Wow!! You created a penguin");
    }
    void walk(){
        System.out.println("Penguin walks on 2 legs");
    }
} 

class abstractClass {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.breathe();
        h1.walk();

        Penguin p1 = new Penguin();
        p1.walk();
    }
}
