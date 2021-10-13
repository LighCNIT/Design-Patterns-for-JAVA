package com.ligh.DecoratorPattern;

public class BigTrouser extends Finery{
	
	Finery base = new Finery();
	
	public void show(){
		
		System.out.println("垮裤");
		base.show();
	}
}
