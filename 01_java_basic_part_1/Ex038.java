/*38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6*/


import java.util.Scanner;


public class Ex038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(inputString.charAt(i))) {
                letters++;
            } else if (Character.isWhitespace(inputString.charAt(i))) {
                spaces++;
            } else if (Character.isDigit(inputString.charAt(i))) {
                numbers++;
            } else {
                others++;
            }
            }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);
        in.close();
    }
}
