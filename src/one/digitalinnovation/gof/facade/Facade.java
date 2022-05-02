package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome,String cep) {
		
		//recuperando cidade estado pelo cep 
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado= CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
