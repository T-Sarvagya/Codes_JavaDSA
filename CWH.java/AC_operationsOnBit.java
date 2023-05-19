public class AC_operationsOnBit {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n& bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n,i);
        // }

        //2nd method
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeIthBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=15;//000001111
        System.out.println(getIthBit(n, 4));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(15, 2));
        System.out.println(updateIthBit(n, 2, 0));
        System.out.println(clearLastIthBit(n, 2));
        System.out.println(clearRangeIthBits(n, 2, 5));
        
    }
}
