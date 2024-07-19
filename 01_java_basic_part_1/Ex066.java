/*66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133*/


public class Ex066 {
    public static void main(String[] args) {
        int ctr = 0;
        int sum = 0;
        int num = 1;
        while (ctr < 100) {
            num++;
            if (isPrime(num)) {
                System.out.println(num);
                ctr++;
                sum += num;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
