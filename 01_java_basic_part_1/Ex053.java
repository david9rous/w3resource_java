/*53. Write a Java program that accepts three integers from the user.
It returns true if the second number is higher than the first number and
the third number is larger than the second number. If "abc" is true,
the second number does not need to be larger than the first number.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
*/


import java.util.Scanner;


public class Ex053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Prvni cislo: ");
        int num1 = in.nextInt();
        System.out.println("Druhe cislo: ");
        int num2 = in.nextInt();
        System.out.println("Treti cislo: ");
        int num3 = in.nextInt();
        System.out.println(numbersTest(num1, num2, num3));
        in.close();
    }

    public static Boolean numbersTest(int a,int b,int c) {
        return a < b && b < c;
    }
}