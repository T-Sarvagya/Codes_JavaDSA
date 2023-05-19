class MyThrr3 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("I am Mythrr3");
        i++;
        }
    }
}
class Mythrr4 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("I am Mythrr4");
        i++;
        }
    }
}
class Mythrr5 extends Thread{
    public void run(){
        // while(true){
        //     try{
        //         Thread.sleep(400);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        // System.out.println("Night");
        
        // }
    }
}
class Mythrr6 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        System.out.println("Good Morning");
        
        }
    }
}

public class CWH_threadMethods {
    public static void main(String[] args) {
        // MyThrr3 t3 = new MyThrr3();
        // Mythrr4 t31 = new Mythrr4();
        // t3.start();
        // //t3.join first completes t3 thread work and then will start with next thread work
        // try{
        //     t3.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // t31.start();

        Mythrr5 p1 = new Mythrr5();
        Mythrr6 p2 = new Mythrr6();
        System.out.println(p1.getState());
        p1.start();
        System.out.println(p1.getState());
        //p2.start();
    }
}
