/*35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722*/


import java.lang.Math;
import java.util.Scanner;


public class Ex035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pocet stran: ");
        int numOfSides = in.nextInt();
        System.out.println("Delka strany: ");
        int side = in.nextInt();
        double areaOfPoly = (numOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numOfSides));
        System.out.println(areaOfPoly);
        in.close();
    }
}
