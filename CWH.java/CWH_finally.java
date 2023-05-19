public class CWH_finally{
    public static int func1(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
       // System.out.println("This is end");// here this code is not printed
        finally{
            System.out.println("This is end of program"); //here it is printed
        }
        return -1;
    }

    public static void main(String[] args) {
        //finally is used to execute code in any situation
        int k = func1();
        System.out.println(k);

        int a = 10;
        int b = 5;
        while(true){
            try{
                int c = a/b;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b: "+ b);
            }
            b--;

        }
 
        // We can use try with finally without catch 
        // try{
        //     int z = 5/0;
        // }
        // finally{
        //     System.out.println("Done");
        // }
    }
    
}