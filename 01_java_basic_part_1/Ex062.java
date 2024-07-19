/*62. Write a Java program that accepts three integer values and returns true if one is 20 or
more less than the others' subtractions.
Sample Output:

Input the first number : 15
Input the second number: 20
Input the third number : 25
false*/


import java.util.Arrays;
import java.util.Scanner;


public class Ex062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int[] nums = {num1, num2, num3};
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int midNum = 0;
        for (int num : nums) {
            if (num != minNum && num != maxNum) {
                midNum = num;
            }
        }
        System.out.println(maxNum - midNum - 20 >= minNum);
        in.close();
    }
}