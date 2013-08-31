package com.home.app.container;

public class ProductEntity {
	public static String generateProductID() {
		String idValue = String.valueOf(Math.random());
		return idValue.substring(3);
	}
}
