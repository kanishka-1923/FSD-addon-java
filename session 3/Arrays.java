package session3;

public class Arrays {
public static void main(String[] args) {
	String[] names = {"Ritika", "Madhu","Anisha", "Hari","Madu"};
	
	//Accessing all elements using for loop
	//for(int i = 0; i<names.length; i++)
		//System.out.println(names[i]);
	//System.out.println(names[2]);
	for(String i : names) {
		System.out.println(i);
	}
		
}
}
