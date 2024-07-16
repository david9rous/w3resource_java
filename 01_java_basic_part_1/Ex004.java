/*4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/

public class Ex004 {
    public static void main(String[] args) {
        int operation01 = -5 + 8 * 6;
        int operation02 = (55 + 9) % 9;
        int operation03 = 20 + (-3) * 5 / 8;
        int operation04 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(operation01);
        System.out.println(operation02);
        System.out.println(operation03);
        System.out.println(operation04);
    }
}
