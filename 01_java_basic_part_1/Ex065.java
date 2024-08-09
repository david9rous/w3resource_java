/*65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19
Input the second number: 7
5*/


import java.util.Scanner;


public class Ex065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(modulus(num1, num2));
        System.out.println(num1 % num2);
        in.close();
    }

    private static int modulus(int num1, int num2) {
        int mod = 0;
        mod = num1 - ((num1 / num2) * num2);
        return mod;
    }
}