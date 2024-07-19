/*58. Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.*/


//Jsem si jisty, ze na to je nejaka metoda nekde v java.text, ale what the hell...
//Asi by na to byl nejlepsi regex, ale to se mi ted nechce.


import java.util.Scanner;


public class Ex058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        System.out.println(capitalize(input));
        in.close();
    }

    private static String capitalize(String str) {
        String capitalizedStr = "";
        int i = 0;
        capitalizedStr += str.toUpperCase().charAt(i);
        i++;
        for (; i <= str.length() - 1; i++) {
            if (str.charAt(i - 1) == ' ') {
                capitalizedStr += str.toUpperCase().charAt(i);
            } else {
                capitalizedStr += str.charAt(i);
            }
        }
        return capitalizedStr;
    }
}