//Programa tirangulo invertido
class invertTriangle {
	public static void main (String args[]) {
		int num = Integer.parseInt(args[0]);
		int i;
		while(num > 0) {
			for (i=1; i<=num; i++) {
				System.out.print(""+num+"");
			}
			System.out.print("\n");
			num--;
		}
	}
}
