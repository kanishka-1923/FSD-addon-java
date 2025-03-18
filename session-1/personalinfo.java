package programs;

import java.util.Scanner;

public class personalinfo {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter ur mobile no:");
		int mob = obj.nextInt();
		
		System.out.println("enter  name :");
		String name = obj.next();
		
		System.out.println("enter  address :");
		String addr = obj.next();
		
		System.out.println("info entered:");
	}
}
