/*63. Write a Java program that accepts two integer values from the user and returns the largest value.
However if the two values are the same, return 0 and find the smallest value if the two values have the
same remainder when divided by 6.
Sample Output:

Input the first number : 12
Input the second number: 13
Result: 13*/


import java.util.Scanner;


public class Ex063 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 != num2) {
            if (sameRemDivBy6(num1, num2)) {
                System.out.println(Math.min(num1, num2));
            } else {
                System.out.println(Math.max(num1, num2));
            }
        } else {
            System.out.println(0);
        }
        in.close();
    }

    private static boolean sameRemDivBy6(int num1, int num2) {
        return num1 % 6 == num2 % 6;
    }
}