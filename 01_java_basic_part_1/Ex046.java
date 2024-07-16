/*46. Write a Java program to display system time.
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017 */


import java.util.Date;


public class Ex046 {
    public static void main(String[] args) {
        Date timeDate = new Date();
        System.out.println(timeDate);
    }
}