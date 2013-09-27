package br.com.ggdio.estoque.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ggdio.estoque.builder.LivroBuilder;
import br.com.ggdio.estoque.model.Autor;
import br.com.ggdio.estoque.model.Livro;

public class LivroDAO {

	public List<Livro> listarLivros(){
		List<Livro> lista = new ArrayList<Livro>();
		LivroBuilder builder = new LivroBuilder();
		lista.add(builder.noAno(2012)
						 .addAutor(new Autor("Paulo Silveira"))
						 .addAutor(new Autor("Adriano Almeida"))
						 .daEditoria("Casa do C�digo")
						 .comNome("Guia do Programador")
						 .comResumo("V� do \"nunca programei\" ...").constroi());
		builder.clear();
		lista.add(builder.noAno(2012)
				.addAutor(new Autor("Vin�cius Baggio Fuentes"))
				.daEditoria("Casa do C�digo")
				.comNome("Ruby on Rails")
				.comResumo("Crie rapidamente aplica��es web").constroi());
		return lista;
	}

	public List<Livro> listarLivros(Integer numeroDaPagina, Integer tamanhoDaPagina) {
		List<Livro> livros = listarLivros();
		
		int indiceInicial = numeroDaPagina * tamanhoDaPagina;
		int indicieFinal = indiceInicial + tamanhoDaPagina;
		
		return livros.subList(indiceInicial, indicieFinal);
	}

}
