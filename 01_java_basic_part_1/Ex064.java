/*64. Write a Java program that accepts two integer values between 25 and 75 and returns true if
there is a common digit in both numbers.
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true*/


import java.util.Scanner;


public class Ex064 {
    public static void main(String[] args) {
        System.out.println("Zadej cislo mezi 25 a 75: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(commonDigit(num1, num2));
    }

    private static boolean commonDigit(int num1,int num2) {
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);
        for (int i = 0; i < strNum1.length(); i++) {
            if (strNum2.contains(String.valueOf(strNum1.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}