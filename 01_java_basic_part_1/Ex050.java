/*50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
Sample Output:

Divided by 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divided by 3 & 5:
15, 30, 45, 60, 75, 90,*/


public class Ex050 {
    public static void main(String[] args) {
        String divBy3 = "";
        String divBy5 = "";
        String divBy3And5 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                divBy3 += String.valueOf(i) + ", ";
            }
            if (i % 5 == 0) {
                divBy5 += String.valueOf(i) + ", ";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                divBy3And5 += String.valueOf(i) + ", ";
            }
        }
        System.out.println("Delitelne 3: ");
        System.out.println(divBy3);
        System.out.println("Delitelne 5: ");
        System.out.println(divBy5);
        System.out.println("Delitelne 3 a 5: ");
        System.out.println(divBy3And5);
    }
}