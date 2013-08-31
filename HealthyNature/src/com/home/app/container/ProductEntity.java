package com.home.app.container;

public class ProductEntity {
	public static String generateProductID() {
		String idValue = String.valueOf(Math.random());
		return idValue.substring(3);
	}
	public static String generateProductKey() {
		return "Vel-"+generateProductID();
	}
}
