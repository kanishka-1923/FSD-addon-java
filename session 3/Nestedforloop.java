package session3;


public class Nestedforloop {
	
	public static void main(String[] args) {
		
		
		// Square printing
		// for(int i = 1; i<=4; i++) { //i=1
			// for(int j = 1; j<=4; j++) { //j=1 to 4 // 4 times iteration happens
				// System.out.print(i);
			    // System.out.print(" "+j);
			//}
			// System.out.println();
		//}

		
		// Triangle printing
		//for(int i =1; i<=5; i++) {
			//for(int j = 1; j<i+1; j++) {
				//System.out.print(j+" ");
			//}
			//System.out.println();
		//}\
		
		//for(int i = 1; i<=5;i++) {
			//for(int j = 1; j<i+1; j++) {
			//	System.out.print(j+" ");
			//}
			//System.out.println();
	//	}
		
		int num = 6;
		
		for(int i=0; i<num; i++) {
		for(int j =1; j<=num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}		
}
