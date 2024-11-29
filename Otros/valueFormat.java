//Programa que lee un valor float, small integer not less and largest integer not greater than the value
import java.util.*;

class valueFormat {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		double number;

		System.out.println("Float type value: ");
		number = scan.nextDouble();

		System.out.println("Small integer not greater than the number is: "+Math.ceil(number));
		System.out.println("Number: "+number);
		System.out.println("Largest integer not greater than the number is: "+Math.floor(number));
	}
}
