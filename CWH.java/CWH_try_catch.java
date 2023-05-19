public class CWH_try_catch {
    public static void main(String[] args){
        int a = 100;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(Exception e){
            System.out.println("We cannot divide because :");
            System.out.println(e);
        }
    }
}
