/*49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20
1*/


import java.util.Scanner;


public class Ex049 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        int inputNum = in.nextInt();
        if (inputNum % 2 == 0) {
            System.out.println("Cislo je sude.");
        } else {
            System.out.println("Cislo je liche.");
        }
        in.close();
    }
}