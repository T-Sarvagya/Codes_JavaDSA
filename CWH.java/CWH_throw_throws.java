class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class CWH_throw_throws {
    public static double area(int radius) throws NegativeRadiusException{
        if(radius<0){
            throw new NegativeRadiusException();
        }
        else{
            double area = Math.PI * radius * radius;
            return area;
        }
    }

    public static int divide (int a, int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args){
        // try{
        //     int c = divide(6, 0);
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println("Exception");
        // }

        try{
           // double area = area(20);
            double area = area(-20);
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
