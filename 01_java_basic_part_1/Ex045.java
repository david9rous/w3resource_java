/*45. Write a Java program to find the size of a specified file.
Sample Output:

/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes*/


import java.io.File;


public class Ex045 {
    public static void main(String[] args) {
        String FILE_PATH = new File("ex044.java").getAbsolutePath();
        File file = new File(FILE_PATH);
        System.out.println(file);
        System.out.println(getFileSizeKB(file));
    }

    private static String getFileSizeKB(File file) {
        return (double) file.length() / 1024 + "kb";
    }
}