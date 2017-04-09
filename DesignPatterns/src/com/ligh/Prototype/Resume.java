package com.ligh.Prototype;

/**
 * 原型模式的深复制、
 * 通过实现Cloneable接口的clone方法来实现对象数据的复制
 * @author gh
 *
 */
public class Resume implements Cloneable{
	
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name){
		
		this.name = name;
		work = new WorkExperience();
	}
	
	/**
	 * 私有构造器调用clone方法克隆数据
	 * @param work
	 * @throws CloneNotSupportedException 
	 */
	private Resume(WorkExperience work) throws CloneNotSupportedException{
		
		this.work = (WorkExperience) work.clone();
	}
	
	public void setPersonInfo(String sex,String age){
		
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExceperience(String workDate,String company){
		
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	public void display(){
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作经历："+work.getWorkDate()+" "+work.getCompany());
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.age = this.age;
		obj.sex = this.sex;
		return obj;
	}
}
