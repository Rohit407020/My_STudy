package com.content2;

import java.util.Arrays;

public class BookArray {
       private int bookId;
       private String bookName;
       private String publishYear;

       public BookArray() {
    	   
       }
	public BookArray(int bookId, String bookName, String publishYear) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.publishYear = publishYear;
	}
		
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}
	
	
	@Override
	public String toString() {
		return "BookArray [bookId=" + bookId + ", bookName=" + bookName + ", publishYear=" + publishYear 
				+ "]";
	}
   		
      
       
       
}
