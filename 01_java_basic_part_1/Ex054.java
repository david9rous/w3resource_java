/*54. Write a Java program that accepts three integers from the user and
returns true if two or more of them (integers) have the same rightmost digit.
The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true*/


import java.util.Scanner;


public class Ex054 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Prvni cislo: ");
        int num1 = in.nextInt();
        System.out.println("Druhe cislo: ");
        int num2 = in.nextInt();
        System.out.println("Treti cislo: ");
        int num3 = in.nextInt();
        System.out.println(compareThreeNums(getRightmostInt(num1), getRightmostInt(num2), getRightmostInt(num3)));
        in.close();
    }

    private static int getRightmostInt(int num) {
        String strNum = String.valueOf(num);
        return Character.getNumericValue(strNum.charAt(strNum.length() - 1));
    }

    private static boolean compareThreeNums(int num1, int num2, int num3) {
        int counter = 0;
        if (num1 == num2) {
            counter++;
        }
        if (num1 == num3) {
            counter++;
        }
        if (num2 == num3) {
            counter++;
        }
        return counter >= 1;
    }
}