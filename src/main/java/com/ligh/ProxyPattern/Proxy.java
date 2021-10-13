package com.ligh.ProxyPattern;

/**
 * 代理类。隐藏真是对象
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 * @author gh
 *
 */
public class Proxy implements IGiveGift {
	
	
	Pursuit gg;
	
	public Proxy(SchoolGirl mm){
		
		gg = new Pursuit(mm);
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		gg.GiveDolls();
		
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		gg.GiveChocolate();
	}

}
