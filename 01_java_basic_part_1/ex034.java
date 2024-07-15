/*34. Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938*/


import java.lang.Math;
import java.util.Scanner;


public class ex034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        double areaOfHex = (6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6)));
        System.out.println(areaOfHex);
        in.close();
    }
}
