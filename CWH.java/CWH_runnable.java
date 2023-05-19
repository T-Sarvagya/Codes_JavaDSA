class MyThrRunnable1 implements Runnable{
    public void run(){
        
        System.out.println("I am a thread with 1 ");
    }
}
class MyThrRunnable2 implements Runnable{
    public void run(){
        
        System.out.println("I am a thread with 2 ");
    }
}

public class CWH_runnable {
    public static void main(String[] args){
        MyThrRunnable1 r1 = new MyThrRunnable1();
        MyThrRunnable2 r2 = new MyThrRunnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        r1.run();
        r2.run();
    }
}
