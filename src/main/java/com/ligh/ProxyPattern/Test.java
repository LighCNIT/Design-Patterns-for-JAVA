package com.ligh.ProxyPattern;

/**
 * 客户端代码
 * @author gh
 *
 */
public class Test {
  public static void main(String[] args) {
	  
	SchoolGirl mm = new SchoolGirl();
	mm.setName("娇娇");
	
	Proxy daili = new Proxy(mm);
	
	daili.GiveDolls();
	daili.GiveFlowers();
	daili.GiveFlowers();
}
}
