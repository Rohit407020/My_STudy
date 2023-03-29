package com.contentment;

public class AuthorArray {
   private int aId;
   private String aName;
   
   public AuthorArray() {
	   
   }
	public AuthorArray(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}
	

	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "AuthorArray [aId=" + aId + ", aName=" + aName + "]";
	}
	
   
   
}
