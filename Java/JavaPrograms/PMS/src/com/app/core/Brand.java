package com.app.core;

public enum Brand {
	CELLO(20), PARKER(30), REYNOLDS(15), LEXI(10), TRIMAX(50);
	private int price;

	private Brand(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}