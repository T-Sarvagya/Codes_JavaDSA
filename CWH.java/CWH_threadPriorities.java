class MyThrr1 extends Thread{
    public MyThrr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am "+ this.getName());
    }
}

public class CWH_threadPriorities {
    public static void main(String[] args) {
        MyThrr1 t1 = new MyThrr1("Sarvagya1");
        MyThrr1 t2 = new MyThrr1("Sarvagya2");
        MyThrr1 t3 = new MyThrr1("Sarvagya3");
        MyThrr1 t4 = new MyThrr1("Sarvagya4");
        MyThrr1 t5 = new MyThrr1("Sarvagya5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
