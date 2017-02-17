package DecoratorPattern;

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
