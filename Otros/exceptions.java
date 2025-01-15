class exceptions {
	public static void main (String[] args) {
		String[] lang = {"C","C++","Java","Rust","Python"};
		try{
			for (int c = 1; c<=5; c++) {
				System.out.println(lang[c]);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
