package com.geeks;

public class CheckBracket {
	private static void checkbracket(String x) {
		// TODO Auto-generated method stub
		int ans = 0;
        char ch[] = x.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '('){
                ans++;
            }
           if(ch[i] == ')') {
        	   ans--;
           }
        }
        if(ans==0) {
        	System.out.println("Present");
        }
        else {
        	System.out.println("Not Present");
            
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "{([]}";
        checkbracket(x);
	}

	

}
