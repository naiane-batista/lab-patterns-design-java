package one.digitalinnovation.gof.singleton;

//singleton preguicoso, no primeiro momento já nao disponibiliza a instancia pro usuario

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	//O Construtor private nao permite essa classe ser instanciada externamente
	private SingletonLazy() {
		super();
	}
	
	//metodo p expor de maneira unica pra poder instanciar 	
	public static SingletonLazy getInstancia() {
		if(instancia==null) { //só  se for ==null eu crio uma instancia p ela
			instancia=new SingletonLazy(); //instanciando
		}
		
		return instancia;  
	}
}
 