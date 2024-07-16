/*39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. 
Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                                 
431                                                      
432                                                      
Total number of the three-digit-number is 24*/


public class Ex039 {
    public static void main(String[] args) {
        int number = 123;
        String strNumber;
        while (number <= 432) {
            int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0;
            strNumber = String.valueOf(number);
            for (int i = 0; i < 3; i++) {
                if (strNumber.charAt(i) == '1') {
                    digit1++;
                }
                if (strNumber.charAt(i) == '2') {
                    digit2++;
                }
                if (strNumber.charAt(i) == '3') {
                    digit3++;
                }
                if (strNumber.charAt(i) == '4') {
                    digit4++;
                }
            }
            if (digit1 + digit2 + digit3 + digit4 == 3 &&
            digit1 < 2 && digit2 < 2 && digit3 < 2 && digit4 < 2) {
                System.out.println(number);
            }
            number++;
            }
        }
    }
