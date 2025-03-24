package session3;

public class AccesseEncapsulation {

	public static void main(String[] args) {
		Encapsulation ee = new Encapsulation();
		ee.setName("sandy");
		ee.setLocation("cbe");
		
		System.out.println(ee.getName());
		System.out.println(ee.getLocation());
	}
}
