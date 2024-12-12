class staticBlock {
	public static void main (String[] args){
		System.out.println("Metodo main ejecutado");
	}

	static {
		System.out.println("Bloque estatico es ejecutado antes del main");
	}
}