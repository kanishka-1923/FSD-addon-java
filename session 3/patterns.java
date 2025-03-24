package session3;

import java.util.Scanner;

public class patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
	       //top		
			for(int i =1; i<=rows; i++) {
				for(int j = i; j<rows; j++) {
					System.out.print(" ");
				}
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
			}
			
			//bottom
			for(int i =rows-1; i>=1; i--) {
				for(int j = rows; j>i; j--) {
					System.out.print(" ");
				}
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}

	}


