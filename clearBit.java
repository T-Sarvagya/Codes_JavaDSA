class clearBit {
    public static void main(String[] args){
        int num = 5 ; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int newBit = ~bitMask;
        int newnum = newBit & num;
        System.out.println(newnum);
    }
}
