package DecoratorPattern;

public class TestDecorator {
	
	public static void main(String[] args){
		Person xc = new Person("小菜");
		System.out.println("\n 第一种装扮：");
		
		BigTrouser kk = new BigTrouser();
		Tshirts ts = new Tshirts();
		
		
		
		kk.Decorator(xc);
		
		ts.Decorator(kk);
		kk.show();
		ts.show();
		xc.show();
		//kk.show();
	}
}
