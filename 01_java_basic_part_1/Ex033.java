/*33. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/


import java.util.Scanner;


public class Ex033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numString = in.nextLine();
        int sumOfDigits = 0;
        for (int i = 0; i < numString.length(); i++) {
            char numString2 = numString.charAt(i);
            int num = Integer.parseInt(String.valueOf(numString2));
            sumOfDigits += num;
        }
        System.out.println(sumOfDigits);
        in.close();
    }
}
