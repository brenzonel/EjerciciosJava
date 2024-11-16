import java.util.Arrays;

class binarySearchImp {
	public static void main (String args[]){
		int c, local, number[] = {1,2,3,5,6,8,9};

		System.out.println("Busqueda binaria\nArray:");
		local = Arrays.binarySearch(number,6);
		for(c=0;c<number.length;c++)
			System.out.print(number[c]);
		System.out.println("\n"+6+" se encontro en la posicion: "+local);
	}
}
