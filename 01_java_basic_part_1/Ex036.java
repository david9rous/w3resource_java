/*36. Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km */


import java.util.Scanner;
import java.lang.Math;


public class Ex036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sirka 1: ");
        double x1 = in.nextDouble();
        System.out.println("Delka 1: ");
        double y1 = in.nextDouble();
        System.out.println("Sirka 2: ");
        double x2 = in.nextDouble();
        System.out.println("Delka 2: ");
        double y2 = in.nextDouble();
        double distance = 6371 * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))) + 
        (Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - 
        Math.toRadians(y2))));
        System.out.println(distance);
        in.close();
        //Ano, je to hnus. Moc ted nemyslim na upravu.
    }
}
