package com.ligh.ObserverPattern;

public class Test {
	
public static void main(String[] args) {
	
	Subject Ligh = new ConcreteSubject();
	
	Wacher one = new ConcreteWacher();
	Wacher two = new ConcreteWacher();
	Wacher three = new ConcreteWacher();
	
	Ligh.addWacher(one);
	Ligh.addWacher(two);
	Ligh.addWacher(three);
	
	Ligh.removeWacher(three);
	
	Ligh.notifyWacher("老板来了！");
	
}
}
