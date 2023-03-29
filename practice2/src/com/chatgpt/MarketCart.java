package com.chatgpt;

public class MarketCart {
	
   private int cartId;
   private Items items;
   
   public MarketCart() {
	   
   }
   public MarketCart(int cartId,Items items)
   {
	   this.cartId = cartId;
	   this.items = items;
   }
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	
	public String toString() {
		return "[Cart :]"+cartId+" "+items;
	}
   
}
