package com.contentment;

public class Course {
   private int cId;
   private String cName1;
   private String cName2;
   
   public Course() {
	   
   }

public Course(int cId, String cName1, String cName2) {
	super();
	this.cId = cId;
	this.cName1 = cName1;
	this.cName2 = cName2;
}

public int getcId() {
	return cId;
}

public void setcId(int cId) {
	this.cId = cId;
}

public String getcName1() {
	return cName1;
}

public void setcName1(String cName1) {
	this.cName1 = cName1;
}

public String getcName2() {
	return cName2;
}

public void setcName2(String cName2) {
	this.cName2 = cName2;
}

@Override
public String toString() {
	return "Course [cId=" + cId + ", cName1=" + cName1 + ", cName2=" + cName2 + "]";
}

   
   
}
