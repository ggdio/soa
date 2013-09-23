package br.com.ggdio.estoque.service;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		//Inicia o factory de proxies
		ListagemLivrosService listagemLivrosService = new ListagemLivrosService();
		
		//Obtém o proxy de listagem de livros
		ListagemLivros listagemLivros = listagemLivrosService.getListagemLivrosPort();
		
		//Executa o método remoto
		List<Livro> livros = listagemLivros.listarLivros();
		for(Livro livro : livros){
			System.out.println("Nome: "+livro.getNome());
			for(String autor : livro.getAutores()){
				System.out.println("...Autor: "+autor);
			}
		}
	}
	
}
