package sarvagyacode;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){//Setter=>Sets value
        this.name = n; //We can write this.name or directly name also
    }
    public String getName(){//Getter=> Returns value
        return name;
    }
    public void setId(int n){
        this.id = n;
    }
    public int getId(){
        return id;
    }
}
class CWH_GetterSetter {
    public static void main(String[] args) {
        MyEmployee S = new MyEmployee();
        S.setName("Sarvagya");
        S.setId(19);
        System.out.println(S.getName());
        System.out.println(S.getId());
    }
}
