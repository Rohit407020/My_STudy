package com.content2;

import java.util.Arrays;

public class AuthorArray {
       private int id;
       private String name;
	   private BookArray b[];
       public AuthorArray() {
       
       }
	public AuthorArray(int id, String name, BookArray b[]) {
		
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BookArray[] getB() {
		return b;
	}
	public void setB(BookArray b[]) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "AuthorArray [id=" + id + ", name=" + name + ", b=" + Arrays.toString(b) + "]";
	}
       
       
}
