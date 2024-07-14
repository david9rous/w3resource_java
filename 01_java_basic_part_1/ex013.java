/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */


public class ex013 {
    public static void main(String[] args) {
        double sideA = 5.5;
        double sideB = 8.5;
        double area = sideA * sideB;
        double perimeter = 2 * (sideA + sideB);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
