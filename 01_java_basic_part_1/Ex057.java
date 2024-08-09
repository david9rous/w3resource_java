/*57. Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25
3*/


import java.util.Scanner;


public class Ex057 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cislo: ");
        int num = in.nextInt();
        int factor = num / 2;
        int numOfFactors = 1;
        in.close();
        for ( ; factor > 0; factor--) {
            if (num % factor == 0) {
                numOfFactors++;
            }
        }
        System.out.println("Pocet delitelu: ");
        System.out.println(numOfFactors);
    }
}