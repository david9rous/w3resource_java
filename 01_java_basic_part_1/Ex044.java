/*44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5
5 + 55  + 555*/


import java.util.Scanner;


public class Ex044 {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String strNum = Integer.toString(num);
        String strNum2 = strNum + strNum;
        String strNum3 = strNum + strNum + strNum;
        System.out.println(Integer.valueOf(strNum) + Integer.valueOf(strNum2) + Integer.valueOf(strNum3));
        in.close();
    }
}