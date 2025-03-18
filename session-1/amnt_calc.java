package programs;

import java.util.Scanner;

public class amnt_calc {
	public static void main(String[] args) {
		int amt1, amt2, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amound1: ");
		amt1=sc.nextInt();
		System.out.println("enter amount2:");
		amt2=sc.nextInt();
		
		res= amt1 + amt2;
		if(res<50)
		{
			System.out.println("result is less than 50");
		}
		else
		{
			System.out.println("result is greater than 50");
		}
	}
}
