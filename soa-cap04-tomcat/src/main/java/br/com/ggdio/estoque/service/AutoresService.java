package br.com.ggdio.estoque.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.ggdio.estoque.dao.AutoresDAO;
import br.com.ggdio.estoque.model.Autor;

@WebService
public class AutoresService {
	
	@WebResult(name="autor")
	public List<Autor> listarAutores(){
		return obterDAO().listarAutores();
	}
	
	public AutoresDAO obterDAO(){
		return new AutoresDAO();
	}
	
}
