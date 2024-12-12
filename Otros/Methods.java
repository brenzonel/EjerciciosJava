class Methods{
	Methods(){
		System.out.println("Constructor del method es llamado cuando un objeto de esta clase se crea");
	}

	public static void main (String[] args){
		staticMethod();
		Methods object = new Methods(); //static
		object.nonStaticMethod();
	}

	static void staticMethod(){
		System.out.println("Metodo estatico puede ser llamado sin la creacion de un objeto");
	}

	void nonStaticMethod(){
		System.out.println("Metodo no estatico puede ser llamado con la creacion de un objeto");
	}
}