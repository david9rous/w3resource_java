/*51. Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25
The integer value is: 25*/


import java.util.Scanner;


public class Ex051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Napis cislo pro prevedeni: ");
        int num = input.nextInt();
        String strNum = String.valueOf(num);
        System.out.println("Cislo ve formatu String: ");
        System.out.println(strNum);
        input.close();
    }
}