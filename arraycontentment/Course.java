package com.arraycontentment;

public class Course {
	
	private int id;
	private String cname;
	
	Course(){
		
	}
	Course(int id,String cname){
		this.id=id;
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String toString() {
		return "Course :"+cname;
	}
}
