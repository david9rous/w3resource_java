/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/


import java.util.Scanner;


public class ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num01 = scan.nextInt();
        int num02 = scan.nextInt();
        System.out.println(num01 + num02);
        System.out.println(num01 - num02);
        System.out.println(num01 * num02);
        System.out.println(num01 / num02);
        scan.close();
    }
}
