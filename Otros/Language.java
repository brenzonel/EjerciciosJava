//java constructor overloading
class Language {
	String name;
	Language() {
		System.out.println("Constructor method called");
	}
	Language (String l) {
		name = l;
	}

	public static void main (String[] args) {
		Language cpp = new Language();
		Language java = new Language("L Java");

		cpp.setName("C++");
		java.getName();
		cpp.getName();
	}

	void setName (String t) {
		name = t;
	}
	void getName () {
		System.out.println("Language name: "+ name);
	}
}
