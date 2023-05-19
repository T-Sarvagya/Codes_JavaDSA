package sarvagyacode;

class CWH_VariableArguments {

   /*  static int sum(int ...arr){ // Agr ek bhi parameter pass na ho to 0 return ho jayega
        //Available as int[] arr;
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    */
    static int sum(int x, int ...arr){ // Ek parameter to compulsory hai 
        //Available as int[] arr;
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs");
       System.out.println( sum(4,7,5,2 ));
       System.out.println( sum(4,7 ,2,1,4));
       System.out.println( sum(4,7,1,2,3,4 ));
       //System.out.println( sum());  //--> Invalid for second var arg method since it has no argument
      
    }
}