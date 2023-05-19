class MyThrr extends Thread{
    public MyThrr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a thread");
    }
}

public class CWH_Thread_Constructor {
    public static void main(String[] args) {
        MyThrr t1 = new MyThrr("Sarvagya");
        System.out.println("The id of my thread is : "+t1.getId());
        System.out.println("The name of my thread is : "+t1.getName());
        System.out.println("The priority of my thread is : "+t1.getPriority());
        System.out.println(t1.getClass());
        System.out.println(t1.getState());
    }
}
