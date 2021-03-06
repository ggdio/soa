package br.com.ggdio.estoque.rest;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.ggdio.estoque.dao.LivroDAO;
import br.com.ggdio.estoque.model.Livro;

@WebService
public class LivrosService {
	
	@WebResult(name="livro")
	public List<Livro> listarLivros(){
		LivroDAO livroDAO = obterDAO();
		return livroDAO.listarLivros();
	}
	
	@WebResult(name="livro")
	public List<Livro> listarLivrosPaginacao(Integer numeroDaPagina,Integer tamanhoDaPagina){
		LivroDAO livroDAO = obterDAO();
		return livroDAO.listarLivros(numeroDaPagina,tamanhoDaPagina);
	}

	private LivroDAO obterDAO() {
		return new LivroDAO();
	}
	
}
