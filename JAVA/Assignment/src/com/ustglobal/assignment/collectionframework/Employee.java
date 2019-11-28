package com.ustglobal.assignment.collectionframework;

public class Employee {
	
	int eid;
	String name;
	long no;
	
	

	public Employee(int eid, String name, long no) {
		super();
		this.eid = eid;
		this.name = name;
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", no=" + no + "]";
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public long getNo() {
		return no;
	}

	public Employee get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
