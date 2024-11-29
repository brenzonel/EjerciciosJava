//Encontrar el menor de 2 numeros usando la condicion ?:
class minOfTwo {
	public static void main (String args[]) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int result = (i<j) ? i : j;

		System.out.println(result +" es el numero menor");
	}
}
