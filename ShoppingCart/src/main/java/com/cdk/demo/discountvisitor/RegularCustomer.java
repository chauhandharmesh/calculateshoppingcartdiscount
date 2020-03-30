package com.cdk.demo.discountvisitor;

public class RegularCustomer implements CalculateDiscount {

	private int totalCartPrice;

	public RegularCustomer(int totalCartPrice) {
		super();
		this.totalCartPrice = totalCartPrice;
	}

	@Override
	public int calculateDiscount(DiscountVisitor discountVisitor) {
		return discountVisitor.calculateDiscount(this);
	}

	public int getTotalCartPrice() {
		return totalCartPrice;
	}

	public void setTotalCartPrice(int totalCartPrice) {
		this.totalCartPrice = totalCartPrice;
	}

}
