class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Name of student is:"+this.name);
        System.out.println("Age of student is:"+this.age);
    }
}

class OOP{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sarvagya Tiwari";
        s1.age = 19;
        s1.printInfo();
    }
}