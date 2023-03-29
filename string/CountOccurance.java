package com.string;

public class CountOccurance {
    public static void countoccu(String arr) { 
    	char ch[] = arr.toCharArray();
    	int count;
    	for(int i=0;i<ch.length;i++) {
    		if(ch[i]=='1')
    			continue;
    		count = 1;
    		for(int j =i+1;j<ch.length;j++ ) {
    			if(ch[i] == ch[j]) {
    				count++;
    				 ch[j] = '1';
    			}
    		}
    		System.out.println(ch[i] +" :"+count);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "Hello Nice to Meet You".toLowerCase();
       countoccu(s);
	}

}
