package com.encapsulation;

public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1 = new Person();
        p1.setName("Rohit");
        p1.setAge(21);
        p1.setAddress("Pune");
        System.out.println(p1.toString());
        p1.setAge(22);
        p1.getAge();
        System.out.println(p1.toString());
	}

}
