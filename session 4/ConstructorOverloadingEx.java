package session3;

public class ConstructorOverloadingEx {
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloadingEx(String empname, int empid, String location) {
	this.empname = empname;
	this.empid = empid;
	this.location = location;
}
 public ConstructorOverloadingEx(String empname, String location) {
	 this(empname,0,location);
 }
 public ConstructorOverloadingEx(String empname,int empid) {
	 this(empname,empid,null);
 }
public void displayInfo() {
	System.out.println("empname:"+this.empname);
	System.out.println("empid:"+this.empid);
	System.out.println("location:"+this.location);
	
}
		
		public static void main(String[] args) {
			ConstructorOverloadingEx cox = new ConstructorOverloadingEx("sandy",1232490,"cbe");
			ConstructorOverloadingEx cox1 = new ConstructorOverloadingEx("ritika","cbe");
			ConstructorOverloadingEx cox2 = new ConstructorOverloadingEx("madhu", 123345);
			cox.displayInfo();
			cox1.displayInfo();
			cox2.displayInfo();
		}
		


}
