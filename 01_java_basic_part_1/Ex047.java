/*47. Write a Java program to display the current date and time in a specific format.
Sample Output:

Now: 2017/06/16 08:52:03.066*/


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class Ex047 {
    public static void main(String[] args) {
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+1")));
        System.out.println(String.format("\nNow: " + cdt.format(System.currentTimeMillis())));
    }
}