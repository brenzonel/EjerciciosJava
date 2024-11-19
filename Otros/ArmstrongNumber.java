import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //int number = 153; // Example number
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Find the number of digits in the number
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the sum of the nth power of its digits
        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        // Check if the result is equal to the original number
        return result == number;
    }
}