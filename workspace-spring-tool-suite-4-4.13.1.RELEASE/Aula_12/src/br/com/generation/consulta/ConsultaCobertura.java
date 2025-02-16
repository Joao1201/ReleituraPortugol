package br.com.generation.consulta;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;
import br.com.generation.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		
		Motoristas motoristas = new Motoristas();
		//Motorista motorista = motoristas.porNome("Jo�o");
		//String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
		
		String cobertura = motoristas.porNome("Jos�")
				.flatMap(Motorista::getCaminhao)
				.flatMap(Caminhao::getSeguro)
				.map(Seguro::getCobertura)
				.orElse("Sem cobertura..");
		
		System.out.println("Status da cobertura: "+cobertura);
		
	}

}