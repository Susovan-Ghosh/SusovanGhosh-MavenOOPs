package com.code;

public class Chocolate extends Gift {

	Chocolate(String giftName) {
		super(giftName);
		// TODO Auto-generated constructor stub
	}
	private String chocolateName=giftName;
	@Override
	void showDetail() {
		System.out.println("name :"+chocolateName);
	}
	public String getName() {
		return chocolateName;
	}
	
}
