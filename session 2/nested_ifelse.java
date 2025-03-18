package programs;

import java.util.Scanner;

public class nested_ifelse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter your age: ");
		int age = sc.nextInt();
		
        System.out.println("enter your weight: ");
        int weight = sc.nextInt();

		if(age>=20) {

			if(weight>50) {

			System.out.println("age and weight is satisfied to donate blood");

		}else {

			System.out.println("Under weight cannot donate blood");
		}

		}else {

			System.out.println("age is not satisfied to donate blood");
		}
   }

}

