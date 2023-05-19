package sarvagyacode;

class MyEmployeee {
    private int id;
    private String name;

    public void setName(String name) {  this.name = name; }
    public String getName() { return name; }
    public void setId(int id) { this.id = id; }
    public int getId() {  return id; }

    public MyEmployeee() { //Constructor --> They have same name as that of the class nd called if id name is not set ,they can be overloaded
        id = 0;
        name = "Your-Name-Here";
    }
    public MyEmployeee(String myname , int myid) {
        id = myid;
        name = myname;
    }
}

public class CWH_Constructors {
    public static void main(String[] args) {
        MyEmployeee e1 = new MyEmployeee();
        MyEmployeee e2 = new MyEmployeee();
        MyEmployeee e3 = new MyEmployeee("Satyam",06);

        e1.setName("Sarvagya");
        System.out.println(e1.getName());
        e1.setId(19);
        System.out.println(e1.getId());

        System.out.println(e2.getName());
        System.out.println(e2.getId());

        System.out.println(e3.getName());
        System.out.println(e3.getId());

    }
}
