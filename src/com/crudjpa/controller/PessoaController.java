package com.crudjpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.crudjpa.modelo.Pessoa;


public class PessoaController {

	EntityManagerFactory emf;
	EntityManager em;
		
	public PessoaController() {
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
	}
	
	public void salvar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Pessoa pessoa) {
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete pessoa from pessoa where matricula ="+pessoa.getMatricula());
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Pessoa> listar(){
		
		em.getTransaction();
		Query q = em.createQuery("Select * from pessoa");
		List<Pessoa> lista = q.getResultList();
		em.getTransaction().commit();
		emf.close();
		
		return lista;
	}
}
