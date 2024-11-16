import java.util.Scanner;

class binarySearch {
	public static void main (String args[]){
		int c, local, first, last, middle, n, search, array[]; //Init
		Scanner in = new Scanner(System.in);

		System.out.println("Numero de elementros: ");
		n = in.nextInt();
		array = new int[n];

		System.out.println("Ingrese "+n+" numeros enteros");
		for (c=0; c<n; c++)
			array[c] = in.nextInt();

		System.out.println("Numero a buscar en los elementos: ");
		search = in.nextInt();

		first = 0; 
		last = n-1;
		local = 0;

		//busqueda
		while (first <= last){
			middle = first+(last-first) / 2;
			//En medio
			if (array[middle] == search){
				local = middle;
				break;
			}
		
			//> middle, ignora izquierda
			if (array[middle] < search)
				first = middle+1;
			else
				last = middle-1;
		}
		local++;
		System.out.println(search+" se encontro en la posicion "+(local)+".");
	}
}
