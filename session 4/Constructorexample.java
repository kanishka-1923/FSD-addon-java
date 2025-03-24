package session3;

public class Constructorexample {
	
	public Constructorexample() {
		System.out.println("Deafult Constructor");
	}
	public Constructorexample(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized constructor");
	}

	public int sum(int a, int b) {
		int res = a+ b;
		return res;
	}
	
	public static void main(String[] args) {
		Constructorexample cx = new Constructorexample();
		Constructorexample ce = new Constructorexample("sandy", "19");
		System.out.println(ce.sum(5,10));
	}

}


