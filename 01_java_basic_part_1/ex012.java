/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/


import java.util.Scanner;


public class ex012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num01 = in.nextInt();
        int num02 = in.nextInt();
        int num03 = in.nextInt();
        System.out.println("Prumer: ");
        System.out.println((num01 + num02 + num03) / 3);
        in.close();
    }
}
