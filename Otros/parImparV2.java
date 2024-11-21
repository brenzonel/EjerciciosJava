import java.util.Scanner;

class parImparV2 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int number;

		System.out.println("Ingrese un numero: ");
		number = scan.nextInt();

		if((number/2)*2 == number)
			System.out.println("El numero "+number+" es par");
		else
			System.out.println("El numero "+number+" es impar");
	}
}
