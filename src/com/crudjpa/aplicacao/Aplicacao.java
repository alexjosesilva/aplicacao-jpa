package com.crudjpa.aplicacao;

import java.util.Iterator;
import java.util.List;

import com.crudjpa.controller.CarroController;
import com.crudjpa.controller.PessoaController;
import com.crudjpa.modelo.Carro;
import com.crudjpa.modelo.Pessoa;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Chaves");
		pessoa.setMatricula("1010101");
		pessoa.setIdade(12);

		PessoaController com = new PessoaController();
		com.salvar(pessoa);	
		
		//salvar
		Carro carro1 = new Carro();	
		carro1.setNome("Ferrari");
		
		Carro carro2 = new Carro();	
		carro2.setNome("BMW");
		
		Carro carro3 = new Carro();	
		carro3.setNome("Camaro");
		
		CarroController car = new CarroController();
		
		//salvar
		car.salvar(carro1);
		car.salvar(carro2);
		car.salvar(carro3);
		
		//remover
		car.remover(carro1);
		
		
		//Listar
		List<Carro> carros = car.listar();
		for (int i = 0; i < carros.size() ; i++) {
			System.out.print(" Nome: "+ carros.get(i).getNome());
		}
		
		//atualizar
		car.update(carro2,"Posh");
		
	}

}
