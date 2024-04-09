package com.learning.spring.day1;

public class Battery extends Product {

	
	private boolean rechargeable;
	
	public Battery(String productId, String productName, double price, boolean rechargeable) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
		this.rechargeable = rechargeable;
	}
	
	public boolean isRechargeable() {
		return rechargeable;
	}
	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	@Override
	public String toString() {
		return "Battery [rechargeable=" + rechargeable + "]";
	}
    
    
}
