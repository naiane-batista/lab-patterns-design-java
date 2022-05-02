package one.digitalinnovation.gof.singleton;


//apressado, quando a variavel estatica é definida ele ja atribiu a instancia
public class SingletonEager {

	private static SingletonEager instancia= new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia() {
		return instancia; //consigo retornar a var instancia pq ja foi instanciado
	}
}
