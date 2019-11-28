
public class Employee1 {
	String name;
	int eid;

	public Employee1(String empname , int empid) {
		this.name = name;
		this.eid = eid;
	}

	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id  is "+eid);
		this.sayHello();
	}

	void sayHello() {
		System.out.println("Hello"+name+"Welcome");
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("deepika", 123);
		e1.printDetails();

		Employee1 e2 = new Employee1("alia", 123);
		e2.printDetails();

		Employee1 e3 = new Employee1("sunny", 123);
		e3.printDetails();
	}

}
