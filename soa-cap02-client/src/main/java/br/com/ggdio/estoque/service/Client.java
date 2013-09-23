package br.com.ggdio.estoque.service;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		//Inicia o factory de proxies
		ListagemLivrosService listagemLivrosService = new ListagemLivrosService(Client.class.getResource("/livros.wsdl"));
		
		//Obtém o proxy de listagem de livros
		ListagemLivros listagemLivros = listagemLivrosService.getListagemLivrosPort();
		
		//Executa o método remoto
		List<Livro> livros = listagemLivros.listarLivrosPaginacao(0,2);
		for(Livro livro : livros){
			System.out.println("Nome: "+livro.getNome());
			for(String autor : livro.getAutores()){
				System.out.println("...Autor: "+autor);
			}
		}
	}
	
}
