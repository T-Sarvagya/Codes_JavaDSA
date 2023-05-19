package sarvagyacode;

class cellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFrnd(){
        System.out.println("Calling Sarvagya...");
    }

}
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Square{
    int side;
    int perimeter;
    int area;
    public int sides(int a){
        System.out.print("Side of square is: " );
        return this.side = a;
    }
    public int perimeter(){
        System.out.print("Perimeter of square is: ");
        return this.perimeter = 4*side;
    }
    public int area(){
        System.out.print("Area of triangle is: ");
        return this.area = side*side;
    }

}
class Rectangle{
    int length;
    int breadth;
    public int perimeter(){
        return 2*(length+breadth);
    }
    public int area(){
        return length*breadth;
    }
}
class CWH_oops2 {
    public static void main(String[] args) {
       /*  //Employee class ka
        Employee e1 = new Employee();
        //e1.setName("Sarvagya");
        System.out.println(e1.getName());
        //e1.salary = 5000;
        System.out.println(e1.getSalary());

        //Cellphone class ka
        cellPhone vivo = new cellPhone();
        vivo.vibrate();
        vivo.callFrnd();
        vivo.ring();
       
        //Square class ka
        Square s1 = new Square();
        System.out.println(s1.sides(5));
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        */

        //Rectangle class ka
        Rectangle r1 = new Rectangle();
        r1.length = 2;
        r1.breadth = 3;
        System.out.println("Area is: "+r1.area());
        System.out.println("Perimeter is: "+r1.perimeter());
    }
}
