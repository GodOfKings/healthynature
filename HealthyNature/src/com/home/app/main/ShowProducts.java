package com.home.app.main;

import com.home.app.container.ProductDetails;

public class ShowProducts {
	public static void main(String[] args) {
		String result = ProductDetails.sayHello("Imran");
		System.out.println(result);
	}
}
