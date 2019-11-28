
public class Student {
	String name;
	int rollno;
	final String cname = "Qspiders"; //you have to initialize the final variable otherwise it will throw error
	final int cid;
	Student(String name , int rollno , int cid){   //wrt class
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	
		Student(){       
		
			this.cid = 44;
		}
	     
	final void printDetails() {                    //wrt
		System.out.println("Hi " + name + " Welcome to " + cname);
	}
	
	final void printDetails(String name) {                      //name is local variable 
		System.out.println("Hi " + name + " Welcome to " + cname);
	}
	
	

}
