/*56. Write a Java program to find the number of values in a given range divisible by a given value.
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are
divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:
5*/


import java.util.Scanner;


public class Ex056 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Prvni cislo: ");
        int num1 = in.nextInt();
        System.out.println("Druhe cislo: ");
        int num2 = in.nextInt();
        System.out.println("Delici cislo: ");
        int divider = in.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i % divider == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        in.close();
    }
}