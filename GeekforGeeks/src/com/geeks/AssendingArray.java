package com.geeks;

public class AssendingArray {
	 public static void sort012(int a[],int n)
	    {   int flag = 1;
	        int temp;
	        for(int i=0;i<n;i++){
	            
	            for(int j=i+1;j<n;j++){
	                if(a[i]>=a[j]){
	                   temp = a[i];
	                   a[i] = a[j];
	                   a[j] = temp;
	                }
	            }
	            
	              
	            
	        }
	        for(int k = 0;k<n;k++){
	             System.out.print(a[k]+" "); 
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {0, 2, 1 ,2, 0};
        int n = 5;
        sort012(a,n);
	}

}
