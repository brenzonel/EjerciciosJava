//Java constructor chaining
class GrandParent {
	int a;
	GrandParent (int a) {
		this.a = a;
	}
}
class Parent extends GrandParent {
	int b;
	Parent (int a, int b) {
		super(a);
		this.b = b;
	}
	void show () {
		System.out.println("GrandParents a = "+ a);
		System.out.println("Parents b = "+ b);
	}
}

class Child {
	public static void main (String[] args) {
		Parent object = new Parent(8,9);
		object.show();
	}
}
