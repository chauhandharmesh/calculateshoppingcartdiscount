package com.cdk.demo.discountvisitor;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CalculateDiscountTest {

	DiscountVisitor discountVisitor = new DiscountVisitorImpl();

	@Test
	public void testRegularCustomer() {
		RegularCustomer regularCustomer = new RegularCustomer(15000);
		Assert.assertEquals(1500, regularCustomer.calculateDiscount(discountVisitor));

	}

	@Test
	public void testPremiumCustomer() {
		PremiumCustomer premiumCustomer = new PremiumCustomer(28000);
		Assert.assertEquals(6600, premiumCustomer.calculateDiscount(discountVisitor));
	}

}
