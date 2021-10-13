package com.ligh.DecoratorPattern;

/**
 * 服饰来装饰人
 */
public class Finery extends Person{
	
	protected Person component;
	

	public void Decorator(Person component) {
		this.component = component;		
	}
	
	public void show(){
		if(component != null){
			component.show();
		}
	}
	
}
