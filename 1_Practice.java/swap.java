class swap {
    public static void main(String [] args){
        int a=5;
        int b=7;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value of a is"+a);
        System.out.println("Value of b is"+b);
    }
}
//a = 5 = 0101 (In Binary)
//b = 7 = 0111 (In Binary)

//Bitwise XOR Operation of 5 and 7
//  0101
//^ 0111
//________
// 0010  = 2 (In decimal)

//This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR of input values, i.e, if corresponding bits are different, it gives 1, else it gives 0.
