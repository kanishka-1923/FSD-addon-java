package programs;

public class variables {
     
		int a = 25;
		static int b = 50; 
		public static int print() {
			int mark=94;
			return mark;
		}
		
		void display() {
			int d = 60;
			System.out.println("method inside variables:"+d);
		}
		
	public static void main(String[] args) {
			int c =75;
			
			variables obj1 = new variables();
			System.out.println(obj1.a);
			obj1.display();
			System.out.println(b);
			System.out.println(c);
			System.out.println(print());
			
			variables2.show();
			 variables2 v2 = new variables2();
			 v2.students();
	}
}
