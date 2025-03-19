package session3;

import java.util.Arrays;

public class ArraysMethod {
	public static void main(String[] args) {
		//length of an array
		int[]num= {10,20,30,40,50};
		System.out.println("length of num: "+num.length);
		
		//copying an java
		int[] source = {1,2,3,4,5};
		int[] destination=new int[5];
		
		//copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int i : destination) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//3.array sort
		int[] b = {1,8,4,6,8,};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//4.Array fill
		int[] d= new int[5];
		Arrays.fill(d, 1);
		Arrays.fill(d, 1,4,2); //Index from 1 to 4(n-1)--> 1,2,3 to fill by 2
		
		System.out.println(Arrays.toString(d));
		
	}

}
