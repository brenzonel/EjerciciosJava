import java.util.Scanner;
class division {
	public static void main (String[] args) {
		int a, b, result;
		Scanner input = new Scanner(System.in);
		System.out.println("****Division*****");
		System.out.println("Num a:");
		a = input.nextInt();
		System.out.println("Num b:");
		b = input.nextInt();
		try {
			result = a/b;
			System.out.println("Result: "+result);
		}
		catch (ArithmeticException e){
			System.out.println("Error: "+ e);
		}
	}
}
