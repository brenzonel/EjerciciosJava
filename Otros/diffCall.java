class diffCall{
	public static void main (String[] args){
		display(); //calling without object
		diffCall t = new diffCall(); //calling using object
		t.show();
	}
	static void display(){
		System.out.println("Call without object");
	}
	void show(){
		System.out.println("Call using object");
	}
}
