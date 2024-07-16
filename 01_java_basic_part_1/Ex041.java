/*41. Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90*/


import java.util.Scanner;


public class Ex041 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputCharacter = in.nextLine();
		char charInput = inputCharacter.charAt(0);
		int asciiChar = (int)charInput;
		System.out.println(asciiChar);
		in.close();
	}
}