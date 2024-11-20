import java.util.Scanner;

class ordBubble {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, j, aux; // Declaracion de variables

        System.out.println("Ingrese la cantidad de numeros del arregle: ");
        n = sc.nextInt(); // Se lee la cantidad de numeros del arreglo

        int ord[] = new int[n]; // Declaracion del arreglo
        
        for (i=0; i<n; i++){
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            ord[i] = sc.nextInt(); // Se lee el numero i del arreglo
        }

        for(i=0; i<n; i++){
            for(j=0; j<n-1; j++){
                if(ord[j] < ord[j+1]){
                    aux = ord[j];
                    ord[j] = ord[j+1];
                    ord[j+1] = aux;
                }
            }
        }

        System.out.println("El arreglo ordenado de forma descendente es: ");
        for(i=0; i<n; i++){
            System.out.println(ord[i]);
        }

    }
}