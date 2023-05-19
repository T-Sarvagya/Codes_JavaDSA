class Shape{
    public void area(){
        System.out.println("This is area");
    }
}
class Triangle extends Shape{
    public void area(int h , int b){
        System.out.println(0.5*b*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//FUNCTION OVERRIDING -->  Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class
class PolymorphismOOP1 {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.area(2);

        Triangle t1 = new Triangle();
        t1.area(2, 4);
    }
}
