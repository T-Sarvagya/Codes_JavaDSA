class Student1{
    String name;
    int age;
// METHOD OVERLOADING --> Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality.
//Compile time polymorphism(Static polymorphism) 
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name, int age){
        System.out.print(name);
        System.out.println(age);
    }
}

public class PolymorphismOOP {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.displayInfo("Sarvagya");
        s1.displayInfo("Sarvagya",19);
        s1.displayInfo(19);
        //s1.name = "Sarvagya";
        //s1.age = 19;

        //s1.displayInfo(s1.name);
        //s1.displayInfo(s1.age);
        //s1.displayInfo(s1.name,s1.age);

    }
}
