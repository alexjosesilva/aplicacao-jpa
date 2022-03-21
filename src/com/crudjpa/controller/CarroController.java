package com.crudjpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.crudjpa.modelo.Carro;



public class CarroController {
	EntityManager em;
	EntityManagerFactory emf;
	
	
	public CarroController() {
		emf = Persistence.createEntityManagerFactory("carro");
		em = emf.createEntityManager();
	}
	
	public void salvar(Carro carro) {
		em.getTransaction().begin();
		em.merge(carro);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Carro carro) {
		em.getTransaction().begin();
		em.createNativeQuery("delete from carro where nome="+"'"+carro.getNome()+"'").executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public void update(Carro carro, String nome) {
		em.getTransaction().begin();
		em.createNativeQuery("update carro set nome="+nome).executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Carro> listar(){
	
		em.getTransaction().begin();
		Query q = em.createQuery("Select carro from Carro carro");
		List<Carro> lista = q.getResultList();
		emf.close();
		return lista;
		
	}
	
}
