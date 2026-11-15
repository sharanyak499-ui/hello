

import java.util.Scanner;

public class GCDCalculator {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int result = gcd(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}


