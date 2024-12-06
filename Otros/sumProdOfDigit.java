//Suma y producto de los digitos un numero
class sumProdOfDigit{
	public static int sumDigit(int number){
		int result = 0;
		while (number != 0){
			result += number % 10;
			number /=10;
		}
		return result;
	}

	public static int prodDigit(int number){
		int result = 1;
		while (number != 0){
			result *= number%10;
			number /= 10;
		}
		return result;
	}

	public static void main (String args[]){
		int number = Integer.parseInt(args[0]);
		int resultSum, resultProd = 0;
		resultSum = sumDigit(number);
		resultProd = prodDigit(number);
		System.out.println("La suma de los digitos del numero "+number+" es: "+resultSum);
		System.out.println("La multiplicacion de los digitos del numero "+number+" es: "+resultProd);
	}
}
