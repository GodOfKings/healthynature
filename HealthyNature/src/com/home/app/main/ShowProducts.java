package com.home.app.main;

import com.home.app.container.ProductDetails;
import com.home.app.container.ProductEntity;

public class ShowProducts {
	public static void main(String[] args) {
		String result = ProductDetails.sayHello("Imran");
		System.out.println(result);
		
		String id = ProductEntity.generateProductID();
		System.out.println(id);
	}
}
