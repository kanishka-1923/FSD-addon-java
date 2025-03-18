package programs;
import java.util.Scanner;
public class conditional_statement {
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter your age:");
			int age = sc.nextInt();
			
			if(age>=18) {
				System.out.println("eligible to vote");
			}
			else
			{
				System.out.println("not eligible to vote");
			}
			
	}

}
