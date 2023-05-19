package sarvagyacode;

class CWH_MethodOverloading {
    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(int a){
        System.out.println("Good Night"+ a);
    }
    public static void main(String[] args) {
        foo(6);

    }
    // Return type change krke overloading ni kr skte
    // Parameters change krke bass kr skte hai 
}
