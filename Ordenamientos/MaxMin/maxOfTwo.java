//Encontrar maximo de 2 num obtenidos desde args
class maxOfTwo {
	public static void main (String args[]) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		if (i > j)
			System.out.println(i +" es mas grande que "+ j);
		else
			System.out.println(j +" es mas grande que "+ i);
	}
}
