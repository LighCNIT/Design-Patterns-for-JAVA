package com.ligh.Prototype;

public class PrototypeTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume a = new Resume("大鸟");
		a.setPersonInfo("男", "25岁");
		a.setWorkExceperience("1991-2001", "XXX公司");
		
		Resume b = (Resume) a.clone();
		b.setWorkExceperience("1999-2017", "YYY公司");
		
		a.display();
		b.display();

	}

}
