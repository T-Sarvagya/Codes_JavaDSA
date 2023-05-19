interface Animalss{
    void walkk();
}

class Horse implements Animalss{

    public void walkk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken implements Animalss{
    public void walkk(){
        System.out.println("Walks on 2 legs");
    }
}

class Interfaces {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walkk();

    }
}
