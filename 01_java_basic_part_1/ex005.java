/*5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/


import java.util.Scanner;


public class ex005 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num01 = keyboard.nextInt();
        int num02 = keyboard.nextInt();
        System.out.println(num01 * num02);
        keyboard.close();
    }
}
