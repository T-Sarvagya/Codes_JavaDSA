
class Pattern1{
    public static void main(String[] args){
        for(int i=1 ; i<=4; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern2{

    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern3{
    public static void main(String[] args){
        int m = 5;
        int n = 5;
       for(int i=1; i<=n;i++){
           for(int j=1;j<=m;j++){
               if(i==1 || j==1 || i==n || j==m){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
class Pattern4{
    public static void main(String[] args){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern5{
    public static void main(String[] args){
        int n =4;
        for(int i=1; i<=n;i++){
            // inner loop --> Space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop --> Star print
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern6{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern7{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }
 }
class Pattern8{
    public static void main(String[] args){
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern9{
    public static void main(String[] args){
        int number = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
class Pattern10{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
             
        }
        System.out.println();
    }
}
}
class ButterflyPattern{
    public static void main(String[] args){
        int n = 4;
        // for upper half
        for(int i =1;i<=n;i++){
            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            // second part 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower half
        for(int i=n;i>=1;i--){
            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            // second half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class solidRhombusPattern{
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class numberPyramidPattern{
    public static void main(String[] args){
        int n= 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class palindromePyramidPattern{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class DiamondPattern{
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } //Aternate for stars is j=1 to 2*i-1 ; isme do loop ni lagane padenge
            for(int j=2;j<=(i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");  
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class HollowButterflyPattern{
    public static void main(String[] args){
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                
            }
            System.out.println();
        }
    }
}


