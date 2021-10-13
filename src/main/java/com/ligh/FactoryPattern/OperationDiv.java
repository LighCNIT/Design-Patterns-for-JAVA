package com.ligh.FactoryPattern;

public class OperationDiv extends Operation {
	
	public double getResult(){
		
		double result = 0;
		if(get_numberB() == 0)
			try {
				throw new Exception("除数不能为0 ...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		result = get_numberA() / get_numberB();
		return result;
		
	}

}
