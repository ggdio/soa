package br.com.ggdio.estoque.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ggdio.estoque.builder.LivroBuilder;
import br.com.ggdio.estoque.model.Livro;

public class LivroDAO {

	public List<Livro> listarLivros(){
		List<Livro> lista = new ArrayList<Livro>();
		LivroBuilder builder = new LivroBuilder();
		lista.add(builder.noAno(2012)
						 .addAutor("Paulo Silveira")
						 .addAutor("Adriano Almeida")
						 .daEditoria("Casa do Código")
						 .comNome("Guia do Programador")
						 .comResumo("Vá do \"nunca programei\" ...").constroi());
		builder.clear();
		lista.add(builder.noAno(2012)
				.addAutor("Vinícius Baggio Fuentes")
				.daEditoria("Casa do Código")
				.comNome("Ruby on Rails")
				.comResumo("Crie rapidamente aplicações web").constroi());
		return lista;
	}

}
