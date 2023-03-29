package com.contentment;

import java.util.Arrays;

public class BookArray {
    private int bId;
    private String bName;
    private AuthorArray a;
    
    public BookArray(){
    	
    }
    public BookArray(int bId,String bName,AuthorArray a) {
    	this.a = a;
    	this.bId = bId;
    	this.bName = bName;
    }
   
    public int getBId() {
    	return bId;
    }
    public void setBId(int bId) {
    	this.bId = bId;
    }
    public String getBName() {
    	return bName;
    }
    public void setBName(String bName) {
    	this.bName = bName;
    }
    public AuthorArray getA() {
    	return a;
    }
    public void setA(AuthorArray a) {
    	this.a = a;
    }
   
    public String toString() {
    	return "Book Id :"+bId+" Book Name :"+bName+" Author"+a;
    	
    }
	
    
    
    
    
}

