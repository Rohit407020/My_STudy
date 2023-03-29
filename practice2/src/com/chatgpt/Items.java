package com.chatgpt;

public class Items {
    private int itemId;
    private String itemName;
    private float itemPrice;
    private int itemQuantity;
    
    public Items() {}
    public Items(int itemId,String itemName,float itemPrice,int itemQuantity) {
    	this.itemId = itemId;
    	this.itemName = itemName;
    	this.itemPrice = itemPrice;
    	this.itemQuantity = itemQuantity;
    }
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getCost() {
		return (float)itemPrice*itemQuantity;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public float getItemPrice() {
		return itemPrice;
	}
    
	//tostring
	public String toString() {
		return "[items] :"+itemId+" "+itemName+" "+itemPrice+" "+itemQuantity+" "+getCost();
	}
}
