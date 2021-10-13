package com.ligh.ProxyPattern;

public class Pursuit implements IGiveGift{
	
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm){
		this.mm = mm;
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println("送你洋娃娃");
		
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("送你鲜花");
		
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("送你巧克力");
	}

}
