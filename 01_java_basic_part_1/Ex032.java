/*32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/


import java.util.Scanner;


public class Ex032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num01 = in.nextInt();
        int num02 = in.nextInt();
        if (num01 > num02) {
            System.out.println(num01 + " > " + num02);
        } else if (num01 < num02) {
            System.out.println(num01 + " < " + num02);
        } else if (num01 == num02) {
            System.out.println(num01 + " = " + num02);
        }
    }
}
