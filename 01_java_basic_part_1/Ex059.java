/*59. Write a Java program to convert a string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.*/


import java.util.Scanner;


public class Ex059 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        String lowerStr = inputStr.toLowerCase();
        System.out.println(lowerStr);
        in.close();
    }
}