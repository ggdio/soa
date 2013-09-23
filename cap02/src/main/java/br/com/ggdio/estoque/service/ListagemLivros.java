package br.com.ggdio.estoque.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.ggdio.estoque.dao.LivroDAO;
import br.com.ggdio.estoque.model.Livro;

@WebService
public class ListagemLivros {
	
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
	
	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.101:8080/livros", new ListagemLivros());
		System.out.println("Serviço Inicializado!");
	}
	
}
