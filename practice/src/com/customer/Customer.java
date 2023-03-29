package com.customer;

public class Customer {
   private int cid;
   private String name,itemName,status,phoneNumber;
   private float price;
   
   
   public Customer(){
	   System.out.println("Default Cunstructor");
	   itemName = "None";
	   status = "Unknown";
	   price = 0;
   }
   
   public Customer(int id,String n,String ph)
   {
	   this.cid = id;
	   this.name = n;
	   this.phoneNumber = ph;
   }
   
   public Customer(int id,String n,String in,float p,String st,String ph)
   {
	   this.cid = id;
	   this.name = n;
	   this.itemName = in;
	   this.price = p;
	   this.status = st;
	   this.phoneNumber = ph;
	   
   }
 ///getter setter 
   
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

// to string

public String toString() {
	return "Customer Id :"+this.cid+"\n Customer Name :"+this.name+
			"\n Item Name :"+this.itemName+"\n Item Price :"+this.price+"\n Ststus : "+this.status+"\n Phone Number : "+this.phoneNumber;
	
}
   
   
}
