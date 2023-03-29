package com.content2;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AuthorArray a[] = new AuthorArray[2];
        
        BookArray b[] = new BookArray[2];// array create
        
        a[0] = new AuthorArray(101,"Pratik",b);
//        a[1] = new AuthorArray(102,"Rohit");
        
        b[0] = new BookArray(1,"Backbecher","2023");
        b[1] = new BookArray(2,"Maal","2023");
        
        for(int i=0;i<b.length;i++) {
        	System.out.println(b[i].toString());
        }
        System.out.println("###########################");
        BookArray b1[] = new BookArray[2];// array create
        a[1] = new AuthorArray(102,"Rohit",b1);
       
        b1[0] = new BookArray(1,"Kay","2023");
        b1[1] = new BookArray(2,"Bolti","2023");
        
        for(int i=0;i<b1.length;i++) {
        	System.out.println(b1[i].toString());
        }
	}

}
