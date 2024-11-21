import java.util.Scanner;

class parImpar {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("Digite un numero: ");
		number = scan.nextInt();

		if (number % 2 == 0)
			System.out.println("El numero "+number+" es par");
		else
			System.out.println("El numero "+number+" es impar");

	}
}	
