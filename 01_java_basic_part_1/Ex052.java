/*52. Write a Java program to calculate the sum of two integers and
return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true*/


import java.util.Scanner;


public class Ex052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prvni cislo souctu: ");
        int num1 = input.nextInt();
        System.out.println("Druhe cislo souctu: ");
        int num2 = input.nextInt();
        System.out.println("Treti cislo pro porovnani: ");
        int num3 = input.nextInt();
        System.out.println("Soucet: " + (num1 + num2));
        if (num1 + num2 == num3) {
            System.out.println("Soucet prvnich dvou cisel se rovna tretimu.");
        } else {
            System.out.println("Soucet prvnich dvou cisel se nerovna tretimu.");
        }
        input.close();
    }
}