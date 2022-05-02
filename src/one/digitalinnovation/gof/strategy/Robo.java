package one.digitalinnovation.gof.strategy;

public class Robo {

	//nossa estrategia de comportamento
	private Comportamento comportamento;

	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	//garantir meu robo se mover
	public void mover() {
		comportamento.mover();
	}
	

}
