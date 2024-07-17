/*55. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:

Input seconds: 86399
23:59:59*/


import java.util.Scanner;


public class Ex055 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadej vteriny (max 86399): ");
        int input = in.nextInt();
        int hours = input / 3600;
        int minutes = (input - hours * 3600) / 60;
        int seconds = (input % 60);
        System.out.println();
        System.out.println(doubleDigit(hours) + ":" + doubleDigit(minutes) + ":" + doubleDigit(seconds));
        in.close();
    }

    private static String doubleDigit(int num) {
        String strNum = String.valueOf(num);
        if (strNum.length() == 1) {
            return "0" + strNum;
        } else {
            return strNum;
        }
    }
}