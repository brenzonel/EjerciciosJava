//Programa concatena en un string la cantidad de numeros en orden
//ascendente obtenidos desde parametros
class concatNum{
	public static void main (String args[]){
		int num = Integer.parseInt(args[0]);
		String cadena = "";
		for (int i=1; i<=num; i++){
			cadena = cadena + i + "";
		}
		System.out.println("Resultado:\n"+cadena);
	}
}
