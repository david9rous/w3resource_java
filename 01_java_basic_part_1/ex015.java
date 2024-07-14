/*15. Write a Java program to swap two variables.*/


public class ex015 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int temp;
        System.out.println("Pred:");
        System.out.println(a);
        System.out.println(b);
        temp = b;
        b = a;
        a = temp;
        System.out.println("Po:");
        System.out.println(a);
        System.out.println(b);
    }
}
