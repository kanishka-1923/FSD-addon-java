package programs;

public class operators {
	public static void main(String[] args) {
		int a = 5, b = 8;
		
        //addition
		System.out.println("Addition "+(a+b));
		System.out.println("Subraction "+(a-b));
	    System.out.println("Multiplication "+(a*b));
		
		//relational
	    System.out.println("equal to "+(a==b));
	    System.out.println("not equal "+(a!=b));
	    System.out.println("greater than "+(a>b));
	    System.out.println("less than equal to "+(a<=b));
	    
	    //logical &&(AND), ||(OR),!(NOT)
	    boolean condition1=true, condition2=false;
	    
		System.out.println("logical AND"+(condition1 && condition2));
		System.out.println("logical OR"+(condition1 || condition2));
		System.out.println("logical NOT "+(!condition1  ));
		
		//unary
		System.out.println("Unary Negation"+(~a)); //5
		System.out.println("Unary Negation"+(~b));
		System.out.println("Post Increment"+(a++ + --a + ++a));  //5(6)
		System.out.println("Pre Decrement"+(--b)); // 7
		
		//Assignment
		a+=5;
		System.out.println("+=: "+a);
		
		//ternary ?:
		String res = (a>b)?"a is greater" : "b is greater";	
		System.out.println("result:"+res);
		
		//Bitwise
		/**
		 * AND ---> &
		 * OR ----> |
		 * NOT ---> ~
		 * XOR ----> ^		 */
		
	}
}
