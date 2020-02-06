package com.code;

public abstract class Gift {
	String giftName;
	Gift(String giftName){
		this.giftName=giftName;
	}
	abstract void showDetail();
}