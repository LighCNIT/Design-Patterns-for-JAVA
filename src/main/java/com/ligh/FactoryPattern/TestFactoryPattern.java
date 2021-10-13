package com.ligh.FactoryPattern;

public class TestFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper = new Operation();
		oper = OperationFactory.createOperate("/");
		oper.set_numberA(1);
		oper.set_numberB(8);
		double result =  oper.getResult();
		System.out.println(result);
	}

}
