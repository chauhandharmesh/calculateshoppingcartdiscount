package com.cdk.demo.discountvisitor;

public class DiscountVisitorImpl implements DiscountVisitor {

	@Override
	public int calculateDiscount(RegularCustomer regularCustomer) {
		Integer totalCartPrice = regularCustomer.getTotalCartPrice();
		Integer calculatedDiscount = 0;

		if (totalCartPrice > 5000 || totalCartPrice >= 10000) {
			if (totalCartPrice >= 10000) {
				calculatedDiscount = (5000 * 10) / 100;
			} else {
				calculatedDiscount = ((totalCartPrice - 5000) * 10) / 100;
			}
		}

		if (totalCartPrice > 10000) {
			calculatedDiscount += ((totalCartPrice - 10000) * 20) / 100;
		}

		return calculatedDiscount;
	}

	@Override
	public int calculateDiscount(PremiumCustomer premiumCustomer) {
		int totalCartPrice = premiumCustomer.getTotalCartPrice();
		int calculatedDiscount = 0;

		if (totalCartPrice < 4000 || totalCartPrice >= 4000) {
			if (totalCartPrice > 4000) {
				calculatedDiscount = (4000 * 10) / 100;
			} else {
				calculatedDiscount = (totalCartPrice * 10) / 100;
			}
		}

		if (totalCartPrice > 4000 || totalCartPrice >= 8000) {

			if (totalCartPrice >= 8000) {
				calculatedDiscount += (4000 * 15) / 100;
			} else {
				calculatedDiscount += ((totalCartPrice - 4000) * 15) / 100;
			}
		}

		if (totalCartPrice > 8000 || totalCartPrice >= 12000) {

			if (totalCartPrice >= 12000) {
				calculatedDiscount += (4000 * 20) / 100;
			} else {
				calculatedDiscount += ((totalCartPrice - 8000) * 20) / 100;
			}
		}

		if (totalCartPrice > 12000) {
			calculatedDiscount += ((totalCartPrice - 12000) * 30) / 100;
		}

		return calculatedDiscount;
	}

}
