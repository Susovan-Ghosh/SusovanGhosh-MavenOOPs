package com.code;

public class Sweet extends Gift{

	Sweet(String giftName) {
		super(giftName);
		// TODO Auto-generated constructor stub
	}
	private String sweetName=giftName;
	@Override
	void showDetail() {
		System.out.println("name :"+sweetName);
	}
	public String getName() {
		return sweetName;
	}
	
}