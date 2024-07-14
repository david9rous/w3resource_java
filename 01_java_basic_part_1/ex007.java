/*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/


import java.util.Scanner;


public class ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 2; i <= 10; i++) {
            System.out.println(number * i);
        }
        scan.close();
    }
}
