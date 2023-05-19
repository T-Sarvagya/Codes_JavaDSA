import java.util.Date;

public class CWH_date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //number of years passed since 1990
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        //date class
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());//Deprecate
        System.out.println(d.getSeconds());//Deprecate
        
    }
}
