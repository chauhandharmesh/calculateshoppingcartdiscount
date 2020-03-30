package com.cdk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cdk.demo.discountvisitor.DiscountVisitor;
import com.cdk.demo.discountvisitor.DiscountVisitorImpl;
import com.cdk.demo.discountvisitor.PremiumCustomer;
import com.cdk.demo.discountvisitor.RegularCustomer;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {

		

		SpringApplication.run(ShoppingCartApplication.class, args);
	
		DiscountVisitor discountVisitor = new DiscountVisitorImpl();
		RegularCustomer regularCustomer = new RegularCustomer(15000);
		System.out.println(regularCustomer.calculateDiscount(discountVisitor));

		PremiumCustomer premiumCustomer = new PremiumCustomer(28000);
		System.out.println(premiumCustomer.calculateDiscount(discountVisitor));
	}

}
