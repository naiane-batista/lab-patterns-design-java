package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	
			
	//A classe InstanceHolder é uma classe estatica interna e ela vai encapsular essa instancia na classe (InstanceHolder)
	private static class InstanceHolder{		
		private static SingletonLazyHolder instancia= new SingletonLazyHolder();
	}
	
	
	private  SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;//retorna a clsse interna
	} 
}
