/*42. Write a Java program to input and display your password.
Expected Output

Input your Password:
Your password was: abc@123*/


import java.util.Scanner;


public class Ex042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        System.out.println("Your password is: " + password);
    }
}