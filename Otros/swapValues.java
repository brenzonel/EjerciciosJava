//Swap Values in java
class swapValues {
	public static void main (String args[]) {
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);

		System.out.println("*****Antes*****");
		System.out.println("Valor 1: "+val1);
		System.out.println("Valor 2: "+val2);

		//Swap
		val1 = val1 + val2;
		val2 = val1 - val2;
		val1 = val1 - val2;

		System.out.println("*****Despues*****");
		System.out.println("Valor 1: "+val1);
		System.out.println("Valor 2: "+val2);
	}
}
