import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Div by 5
//        System.out.println("Numbers between 1 and 99 divisible by 5:");
//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0)
//                System.out.print(i + " ");
//        }
//        System.out.println();


        // 2. 1 to 100
//        System.out.println("Numbers 1 to 100:");
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) System.out.println(); // 10 per line
//        }


        // 3. 100 to 10
//        System.out.println("Numbers 100 down to 1:");
//        for (int i = 100; i >= 1; i--) {
//            System.out.print(i + " ");
//            if (i % 10 == 1) System.out.println(); // 10 per line
//        }


        // 4. Base to the Power
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter base: ");
//        long base = sc.nextLong();
//        System.out.print("Enter power: ");
//        int power = sc.nextInt();
//
//        long result = 1;
//        for (int i = 1; i <= power; i++)
//            result *= base;
//
//        System.out.println(base + " ^ " + power + " = " + result);


        // 5. Factorial
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int n = sc.nextInt();
//
//        if (n < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//            return;
//        }
//
//        long factorial = 1;
//        for (int i = 2; i <= n; i++)
//            factorial *= i;
//
//        System.out.println(n + "! = " + factorial);


        // 6. Multiples of 7
//        System.out.println("Multiples of 7 up to 98:");
//        for (int i = 7; i <= 98; i += 7)
//            System.out.print(i + (i < 98 ? ", " : ""));


        // 7. Powers of 2
//        System.out.println("Powers of 2:");
//        for (int i = 1; i <= 512; i *= 2)
//            System.out.print(i + (i < 512 ? ", " : ""));


        // 8. Product odds 1 to 15
//        long product = 1;
//        for (int i = 1; i <= 15; i += 2)
//            product *= i;
//
//        System.out.println("Product of odd integers from 1 to 15 = " + product);


        // 9. Average of Postives
//        Scanner sc = new Scanner(System.in);
//        double sum = 0;
//        int count = 0;
//
//        System.out.println("Enter positive numbers (enter a negative to stop):");
//        while (true) {
//            System.out.print("Enter number: ");
//            double num = sc.nextDouble();
//            if (num < 0) break;
//            sum += num;
//            count++;
//        }
//
//        if (count == 0)
//            System.out.println("No positive numbers were entered.");
//        else
//            System.out.printf("Average = %.2f%n", sum / count);


        // 10. Sum
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int n = Math.abs(sc.nextInt()); // handle negatives
//        int original = n, sum = 0;
//
//        while (n > 0) {
//            sum += n % 10; // extract last digit
//            n /= 10;       // remove last digit
//        }
//
//        System.out.println("Sum of digits of " + original + " = " + sum);


        // 11. Count Digits
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int n = Math.abs(sc.nextInt());
//        int count = 0;
//
//        if (n == 0) {
//            count = 1; // 0 has one digit
//        } else {
//            int temp = n;
//            while (temp > 0) {
//                count++;
//                temp /= 10;
//            }
//        }
//
//        System.out.println("Number of digits in " + n + " = " + count);


        // 12. Divide by 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        double n = sc.nextDouble();
//        int count = 0;
//
//        while (n >= 1) {
//            n /= 2;
//            count++;
//        }
//
//        System.out.println("It can be divided by 2 exactly " + count + " time(s) before becoming less than 1.");


        // 13. Div 5 or 6
//        System.out.println("Numbers 100-200 divisible by 5 or 6 (but not both):");
//        int count = 0;
//
//        for (int i = 100; i <= 200; i++) {
//            boolean divBy5 = (i % 5 == 0);
//            boolean divBy6 = (i % 6 == 0);
//
//            if (divBy5 ^ divBy6) { // XOR: one but not both
//                System.out.printf("%4d", i);
//                count++;
//                if (count % 10 == 0) System.out.println();
//            }
//        }
//        System.out.println();


    }
}