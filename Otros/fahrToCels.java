import java.util.*;

class fahrToCels {
       public static void main (String [] args) {
		float temperature;
		int option;
		Scanner in = new Scanner(System.in);
		System.out.println("Inrgresa la unidad de temperatura\n1.-Celsius\n2.- Fahrenheit");
		option  = in.nextInt();
		System.out.println("Ingrese la temperatura: ");
		temperature = in.nextInt();
		if( option == 2 ) {
			temperature = ((temperature - 32) * 5) / 9;
			System.out.println("La temperatura de Fahrenheit a Celsius es "+temperature);
		}
		else {
			temperature = ((temperature * 9) / 5) + 32;
			System.out.println("La temperatura de Celsius a Fahrenheit es "+temperature);
		}
       }
}
