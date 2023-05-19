class setBit {
    public static void main(String[] args){
        int num = 5;
        int pos = 1;
        // bitMask creates 0 in all position except one
        // there is 1 only on the postion place
        int bitMask = 1<<pos ;
        System.out.println(bitMask);
        // below operation is creating 1 on the required postion if it is zero, as it will remain same
        int newnum = (bitMask | num) ;
        System.out.println(newnum);

  
    }
}
