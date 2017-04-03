package br.unifor.progweb.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.unifor.progweb.entitys.Genero;
import br.unifor.progweb.entitys.Jogo;
import br.unifor.progweb.entitys.Midia;
import br.unifor.progweb.entitys.Plataforma;
import br.unifor.progweb.entitys.Produtora;

@Stateless
public class JogoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void gravarNoBanco() {
		Jogo jogo = new Jogo();
		
		jogo.setTitulo("super mario");
		jogo.setDescricao("jogo de aventura");
		
		
		System.out.println(jogo.getTitulo());
		entityManager.persist(jogo);
		
		
		
		
	}

}
