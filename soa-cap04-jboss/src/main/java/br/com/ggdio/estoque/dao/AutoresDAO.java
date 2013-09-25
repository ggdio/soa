package br.com.ggdio.estoque.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.ggdio.estoque.model.Autor;

public class AutoresDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Autor> listarAutores(){
//		return Arrays.asList(new Autor("Paulo Silveira"),new Autor("Guilherme Silveira"),new Autor("Alexandre Saudate"));
		return em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
	}
	
}
