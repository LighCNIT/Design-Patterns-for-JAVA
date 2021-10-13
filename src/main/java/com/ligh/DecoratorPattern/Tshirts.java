package com.ligh.DecoratorPattern;

public class Tshirts  extends Finery{
	
	protected Finery base =new Finery();

	public void show(){
		System.out.println("大T恤");
		base.show();
	}

}
