import java.util.Calendar;
import java.util.GregorianCalendar;

public class CWH_CalenderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
    }
}
