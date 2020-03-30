package com.cdk.demo.discountvisitor;

public interface DiscountVisitor {

	int calculateDiscount(RegularCustomer regularCustomer);

	int calculateDiscount(PremiumCustomer premiumCustomer);

}
