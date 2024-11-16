import java.util.Scanner;
class twoMatrices {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		int m,n,c,d; //Inicializaciones

		System.out.println("Ingresa el numero de renglones de la matriz: ");
		m=in.nextInt();
		System.out.println("Ingresa el numero de columnas de la matriz: ");
		n=in.nextInt();

		int first[][] = new int [m][n];
		int second[][] = new int [m][n];
		int sum[][] = new int [m][n];
		
		//Primera matriz
		System.out.println("Ingresa los elementos de la primer matriz");

		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d] = in.nextInt();
		
		//Segunda matriz
		System.out.println("Ingresa los elementos de la segunda matriz");

		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				second[c][d] = in.nextInt();

		//Suma de matrices
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				sum[c][d] = first[c][d] + second[c][d];

		//Print suma
		System.out.println("Suma de las matrices");
		for(c=0;c<m;c++){
			for(d=0;d<n;d++)
				System.out.print(sum[c][d] +"\t");
			System.out.println();
		}
	}
}

