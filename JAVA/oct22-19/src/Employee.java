
public class Employee {
	String name;
	int eid;
	
	public Employee(String empname , int empid) {
		name = empname;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Emoloyee name is "+name);
		System.out.println("Emoloyee id is "+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("lee min ho",143);
		e1.printDetails();
		Employee e2 = new Employee("Ravi Ranjan",120 );
		e2.printDetails();
		Employee e3 = new Employee("Pyush Panda",113);
		e3.printDetails();
	}
}
