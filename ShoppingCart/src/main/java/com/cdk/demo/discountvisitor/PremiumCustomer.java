package com.cdk.demo.discountvisitor;

public class PremiumCustomer implements CalculateDiscount {

	private int totalCartPrice;

	@Override
	public int calculateDiscount(DiscountVisitor discountVisitor) {
		return discountVisitor.calculateDiscount(this);
	}

	public PremiumCustomer(int totalCartPrice) {
		super();
		this.totalCartPrice = totalCartPrice;
	}

	public int getTotalCartPrice() {
		return totalCartPrice;
	}

	public void setTotalCartPrice(int totalCartPrice) {
		this.totalCartPrice = totalCartPrice;
	}

}
