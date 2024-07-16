/*47. Write a Java program to display the current date and time in a specific format.
Sample Output:

Now: 2017/06/16 08:52:03.066*/


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class Ex047 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        String strDate = String.valueOf(dateFormat);
        System.out.println(strDate);
    }
}